package com.example.dto.response;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
public class ResponseCountryDto extends ResponseDto {

    private String response;
    private List<CountryDto> numbers;

    public ResponseCountryDto(
            @JsonProperty("response") String response,
            @JsonProperty("numbers") List<CountryDto> numbers) {
        this.response = response;
        this.numbers = numbers;
    }
}
