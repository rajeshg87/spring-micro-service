package com.rajesh.router.repo;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.rajesh.router.model.Employee;

public interface EmployeeRepository extends ReactiveMongoRepository<Employee, String> {
}
