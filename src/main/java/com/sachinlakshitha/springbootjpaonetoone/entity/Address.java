package com.sachinlakshitha.springbootjpaonetoone.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Address {
    @Id
    private String id;

    private String addressLine1;
    private String addressLine2;
    private String city;
    private String country;
    private String postalCode;
}
