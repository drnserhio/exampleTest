package com.example.service.impl;

import com.example.client.CountryClient;
import com.example.dto.response.ResponseCountryDto;
import com.example.dto.response.ResponseListCountryDto;
import com.example.dto.response.ResponseListNumberDto;
import com.example.model.Country;
import com.example.service.CountryService;
import com.example.validator.ValidationParseModel;
import lombok.AllArgsConstructor;
import org.apache.commons.lang3.ObjectUtils;
import org.json.simple.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.apache.commons.lang3.StringUtils.*;

@Service
@AllArgsConstructor
public class CountryServiceImpl implements CountryService {

    private final CountryClient countryClient;
    private final ValidationParseModel validationParseModel;


    @Override
    public ResponseListCountryDto getAllCountriesList() {
        ResponseEntity<ResponseListCountryDto> countryList = null;
        try {
            countryList = countryClient.getCountryList();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        if (ObjectUtils.isEmpty(countryList.getBody())) {
            throw new RuntimeException("Body is empty check request to microservice.");
        }
        return countryList.getBody();
    }

    @Override
    public ResponseCountryDto findByCountry(Long country) {

        ResponseEntity<ResponseCountryDto> countryDtoResponse = null;

        try {
            countryDtoResponse = countryClient.findByCountry(country);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        if (ObjectUtils.isEmpty(countryDtoResponse.getBody())) {
            throw new RuntimeException("Body is empty check request to microservice.");
        }
        return countryDtoResponse.getBody();
    }

    @Override
    public Map<String, JSONObject> parseHtmlToJson() {
        ResponseEntity<ResponseListNumberDto> parse = null;
        try {
            parse = countryClient.parse();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        if (ObjectUtils.isEmpty(parse.getBody())) {
            throw new RuntimeException("Body is empty check request to microservice.");
        }
        ResponseListCountryDto countries = getAllCountriesList();
        ResponseListNumberDto body = parse.getBody();
        Map<String, Map<String, String>> bodyList = body.getList();

        return validationParseModel.validationParseAndFrmToMap(bodyList, countries.getCountries());
    }




}
