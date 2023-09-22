package picasso.server.common.util;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum NaverObjectStorageUsageType {
    PROFILE("profile")
    , PAINT("paint");


    private String path;
}
