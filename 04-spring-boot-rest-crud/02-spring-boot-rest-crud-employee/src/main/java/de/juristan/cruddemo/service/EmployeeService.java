package de.juristan.cruddemo.service;

import de.juristan.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();
}
