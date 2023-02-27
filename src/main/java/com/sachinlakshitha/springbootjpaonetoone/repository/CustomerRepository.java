package com.sachinlakshitha.springbootjpaonetoone.repository;

import com.sachinlakshitha.springbootjpaonetoone.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, String> {
}
