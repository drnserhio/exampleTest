package com.example.validator;

import com.example.model.Country;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.apache.commons.lang3.StringUtils.*;

@Component
public class ValidationParseModel {


    private JSONObject parseToJson(JSONObject jsonObject, String key, String value) {
        if (isNotEmpty(key)
                && isNotEmpty(value)) {
            jsonObject.put(key, value);
        }
        return jsonObject;
    }

    public Map<String, JSONObject> validationParseAndFrmToMap(Map<String, Map<String, String>> bodyList, List<Country> countries) {
        Map<String, JSONObject> responseBody = new HashMap<>();
        for (Map.Entry<String, Map<String, String>> linked : bodyList.entrySet()) {
            Long countryId = Long.valueOf(linked.getKey());
            Map<String, String> value = linked.getValue();
            String nameCountry = existByCountryId(countries, countryId);
            if (isEmpty(nameCountry)
                    || isBlank(nameCountry)) {
                continue;
            }
            JSONObject jsonObject = new JSONObject();
            for (Map.Entry<String, String> keysAndValues : value.entrySet()) {
                jsonObject = parseToJson(jsonObject, keysAndValues.getKey(), keysAndValues.getValue());
            }
            responseBody.put(nameCountry, jsonObject);
        }
        return responseBody;
    }

    private String existByCountryId(List<Country> countries, Long keyIdCountry) {
        for (Country country : countries) {
            if (country.getCountry().equals(keyIdCountry)) {
                return country.getCountryText();
            }
        }
        return EMPTY;
    }
}
