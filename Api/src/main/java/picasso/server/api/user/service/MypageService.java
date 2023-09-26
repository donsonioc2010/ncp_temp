package picasso.server.api.user.service;

import jakarta.servlet.http.HttpSession;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import picasso.server.api.user.vo.request.MyPageRequestDto;
import picasso.server.common.exception.NotFoundException;
import picasso.server.common.util.NaverObjectStorageUsageType;
import picasso.server.common.util.NaverObjectStorageUtil;
import picasso.server.domain.domains.user.entity.User;
import picasso.server.domain.domains.user.repository.MypageRepository;
import picasso.server.domain.domains.user.repository.UserRepository;

@Service
@Transactional
@RequiredArgsConstructor
public class MypageService {

  private final MypageRepository mypageRepository;
  private final UserRepository userRepository;
  private final NaverObjectStorageUtil naverObjectStorageUtil;

  public User getUserDetail(Long id) {
    return mypageRepository.findById(id).orElse(null);
  }

  /**
   *
   * @param session 현재 존재하는 Session
   * @param updateRequestDto 수정해야 하는 정보
   * @return
   */

  public User updateUserInfo(HttpSession session, MyPageRequestDto updateRequestDto) {
    User sessionLoginUser = (User) session.getAttribute("loginUser");
    User databaseUserInfo = userRepository.findById(sessionLoginUser.getId()).orElseThrow(()-> NotFoundException.EXCEPTION);

    if(sessionLoginUser.getEmail().equals(databaseUserInfo.getEmail())) {
      if(!databaseUserInfo.getNickName().equals(updateRequestDto.getChgNickName())) {
        databaseUserInfo.setNickName(updateRequestDto.getChgNickName());
      }


      if(!updateRequestDto.getProfile().isEmpty()) {
        databaseUserInfo.setProfile(
                naverObjectStorageUtil.storageFileUpload(
                        NaverObjectStorageUsageType.PROFILE, updateRequestDto.getProfile()
                )
        );
      }
      return databaseUserInfo;
    }

    return null;
  }
}