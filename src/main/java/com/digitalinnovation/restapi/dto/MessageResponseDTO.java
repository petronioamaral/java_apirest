package com.digitalinnovation.restapi.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import java.util.Set;

@Builder(toBuilder = true)
@Data
public class MessageResponseDTO {
    private String message;
}
