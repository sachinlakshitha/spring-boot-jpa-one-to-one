package com.sachinlakshitha.springbootjpaonetoone.dto;

import com.sachinlakshitha.springbootjpaonetoone.entity.Address;
import lombok.Data;

import java.util.Date;

@Data
public class CustomerDto {
    private String id;
    private String name;
    private String email;
    private AddressDto address;
    private Date createdTime;
}
