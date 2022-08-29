package com.sumendra.schoolmanagement.controller;

import com.sumendra.schoolmanagement.dto.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DemoRepo extends JpaRepository<Customer,Integer> {
}
