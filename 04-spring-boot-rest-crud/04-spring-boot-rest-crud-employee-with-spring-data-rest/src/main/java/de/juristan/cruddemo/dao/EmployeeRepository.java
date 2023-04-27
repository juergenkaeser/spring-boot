package de.juristan.cruddemo.dao;

import de.juristan.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

// @RepositoryRestResource(path = "members")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {}
