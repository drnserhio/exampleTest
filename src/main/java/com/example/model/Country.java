package com.example.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@NoArgsConstructor
@Data
public class Country {

    private Long country;
    private String countryText;

    public Country(
            @NotNull
            @JsonProperty("country") Long country,
            @NotNull
            @JsonProperty("country_text") String countryText) {
        this.country = country;
        this.countryText = countryText;
    }

}
