package de.juristan.cruddemo.dao;

import de.juristan.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();
}
