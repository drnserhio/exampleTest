package com.example.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Map;

@Data
public class ResponseListNumberDto extends ResponseDto {

    private Map<String, Map<String, String>> list;

    public ResponseListNumberDto(
            @JsonProperty("list") Map<String, Map<String, String>> list) {
        this.list = list;
    }
}
