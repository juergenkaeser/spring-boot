package de.juristan.cruddemo.rest;

import de.juristan.cruddemo.entity.Employee;
import de.juristan.cruddemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeRestController(EmployeeService theEmployeeService) {
        employeeService = theEmployeeService;
    }

    // expose "/employees" and return a list of employees
    @GetMapping("/employees")
    public List<Employee> findAll() {
        return employeeService.findAll();
    }

    // add mapping for GET /employees/{employeeID}
    @GetMapping("/employees/{employeeID}")
    public Employee getEmployee(@PathVariable int employeeID) {

        Employee theEmployee = employeeService.findById(employeeID);

        if (theEmployee == null) {
            throw new RuntimeException("Employee id not found - " + employeeID);
        }

        return theEmployee;
    }
}
