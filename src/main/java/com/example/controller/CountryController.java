package com.example.controller;

import com.example.dto.response.ResponseCountryDto;
import com.example.dto.response.ResponseListCountryDto;
import com.example.dto.response.ResponseListNumberDto;
import com.example.service.CountryService;
import lombok.AllArgsConstructor;
import org.json.simple.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/api/country")
@AllArgsConstructor
public class CountryController {

    private final CountryService countryService;

    @GetMapping(value = "/all", produces = "application/json;charset=UTF-8")
    public ResponseEntity<ResponseListCountryDto> getAllCountriesList() {
       ResponseListCountryDto responseListCountryDto = countryService.getAllCountriesList();
       return new ResponseEntity<>(responseListCountryDto, OK);
    }


    @GetMapping(produces = "application/json;charset=UTF-8")
    public ResponseEntity<ResponseCountryDto> findByCountry(
            @RequestParam("country") Long country) {
        ResponseCountryDto responseCountryDto = countryService.findByCountry(country);
        return new ResponseEntity<>(responseCountryDto, OK);
    }

    @GetMapping(value = "/parse", produces = "application/json;charset=UTF-8")
    public ResponseEntity<Map<String, JSONObject>> parseHtmlToJson()
            throws IOException {
        Map<String, JSONObject> responseListNumberDto = countryService.parseHtmlToJson();
        return new ResponseEntity<>(responseListNumberDto, OK);
    }
}
