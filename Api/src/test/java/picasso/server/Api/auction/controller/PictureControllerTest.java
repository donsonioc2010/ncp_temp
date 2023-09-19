package picasso.server.Api.auction.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import picasso.server.api.auction.controller.PictureController;
import picasso.server.api.auction.service.PictureService;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(PictureController.class)

class PictureControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private PictureService pictureService;

    @Test
    public void testYourControllerEndpoint() throws Exception {
        mockMvc.perform(get("/pictures/new"))
                .andExpect(status().isOk()) // HTTP 상태코드가 OK(200)인지 확인
                .andExpect(view().name("picture/createPictureForm")) // View 이름을 확인
                .andExpect(model().attributeExists("PictureForm")); // 모델 속성이 존재하는지 확인
    }

}