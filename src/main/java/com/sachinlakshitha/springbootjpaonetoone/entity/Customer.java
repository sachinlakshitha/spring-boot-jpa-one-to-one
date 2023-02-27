package com.sachinlakshitha.springbootjpaonetoone.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Customer {
    @Id
    private String id;
    private String name;
    private String email;
    @OneToOne(cascade = CascadeType.ALL)
    private Address address;
    private Date createdTime;
}
