package uth.networkprogramming.group1.mailer.common.constant;

import lombok.experimental.UtilityClass;

@UtilityClass
public class UrlConstant {
    public static final String BASE_URL = "/api";
    public static final String VERSION = "/v1";
    public static final String EMAIL_URL = BASE_URL + VERSION + "/emails";
    public static final String USER_URL = BASE_URL + VERSION + "/users";

}
