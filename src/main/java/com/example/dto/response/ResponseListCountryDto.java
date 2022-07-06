package com.example.dto.response;

import com.example.model.Country;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
public class ResponseListCountryDto extends ResponseDto {

    private Long response;
    private List<Country> countries;

    public ResponseListCountryDto(
            @JsonProperty("response") Long response,
            @JsonProperty("countries") List<Country> countries) {
        this.response = response;
        this.countries = countries;
    }
}
