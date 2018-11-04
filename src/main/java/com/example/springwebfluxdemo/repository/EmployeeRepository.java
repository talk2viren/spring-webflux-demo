package com.example.springwebfluxdemo.repository;

import com.example.springwebfluxdemo.reactivemongoclient.Employee;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface EmployeeRepository extends ReactiveMongoRepository<Employee,String> {
}
