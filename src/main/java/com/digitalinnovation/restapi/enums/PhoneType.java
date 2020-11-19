package com.digitalinnovation.restapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PhoneType {

    HOME("Home"), MOBILE("mobile"), COMMERCIAL("comercial");

    private final String description;

}




