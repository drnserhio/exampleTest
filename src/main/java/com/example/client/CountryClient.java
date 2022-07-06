package com.example.client;

import com.example.dto.response.ResponseCountryDto;
import com.example.dto.response.ResponseListCountryDto;
import com.example.dto.response.ResponseListNumberDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static com.example.constant.ConstantFeign.*;

@FeignClient(value = "country", url = HOST_MICROSERVICE_COUNTRY)
public interface CountryClient {

    @GetMapping(PATH_COUNTRY_LIST)
    ResponseEntity<ResponseListCountryDto> getCountryList();

    @GetMapping(PATH_PHONE_LIST)
    ResponseEntity<ResponseCountryDto> findByCountry(
            @RequestParam("country") Long country);

    @GetMapping(PATH_PARSE)
    ResponseEntity<ResponseListNumberDto> parse();


}
