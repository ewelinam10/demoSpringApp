package com.ewmysiak.demo_spring_app.Repo;

import java.util.List;

import com.ewmysiak.demo_spring_app.Models.Customer;
import org.springframework.data.repository.CrudRepository;



public interface CustomerRepository extends CrudRepository<Customer, Long> {
    List<Customer> findByAge(int age);
}