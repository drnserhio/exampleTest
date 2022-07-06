package com.example.service;

import com.example.dto.response.ResponseCountryDto;
import com.example.dto.response.ResponseListCountryDto;
import org.json.simple.JSONObject;

import java.io.IOException;
import java.util.Map;

public interface CountryService {

    ResponseListCountryDto getAllCountriesList();

    ResponseCountryDto findByCountry(Long country);

    Map<String, JSONObject> parseHtmlToJson() throws IOException;
}
