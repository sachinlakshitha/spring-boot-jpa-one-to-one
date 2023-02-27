package com.sachinlakshitha.springbootjpaonetoone.dto;

import lombok.Data;

@Data
public class AddressDto {
    private String id;

    private String addressLine1;
    private String addressLine2;
    private String city;
    private String country;
    private String postalCode;
}
