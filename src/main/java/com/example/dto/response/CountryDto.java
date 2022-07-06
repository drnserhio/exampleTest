package com.example.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CountryDto {

    private String number;
    private Long country;
    private String updatedAt;
    private String dataHumans;
    private String phone;
    private String textCountry;
    private String maxDate;
    private String status;

    public CountryDto(
            @JsonProperty("number") String number,
            @JsonProperty("country") Long country,
            @JsonProperty("updated_at") String updatedAt,
            @JsonProperty("data_humans") String dataHumans,
            @JsonProperty("full_number") String phone,
            @JsonProperty("country_text") String textCountry,
            @JsonProperty("maxdate") String maxDate,
            @JsonProperty("status")String status) {
        this.number = number;
        this.country = country;
        this.updatedAt = updatedAt;
        this.dataHumans = dataHumans;
        this.phone = phone;
        this.textCountry = textCountry;
        this.maxDate = maxDate;
        this.status = status;
    }
}
