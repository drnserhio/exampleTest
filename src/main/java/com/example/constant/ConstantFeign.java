package com.example.constant;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class ConstantFeign {

    public static final String HOST_MICROSERVICE_COUNTRY = "https://onlinesim.ru";
    public static final String SLASH = "/";
    public static final String API = "api";
    public static final String PATH_COUNTRY_LIST = SLASH + API + SLASH + "getFreeCountryList";
    public static final String PATH_PHONE_LIST = SLASH + API + SLASH + "getFreePhoneList";
    public static final String PATH_PARSE = SLASH + "price-list-data?type=receive";


}
