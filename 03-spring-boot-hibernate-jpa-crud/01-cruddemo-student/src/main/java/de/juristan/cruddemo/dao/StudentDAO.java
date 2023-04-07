package de.juristan.cruddemo.dao;

import de.juristan.cruddemo.entity.Student;

import java.util.List;

public interface StudentDAO {

    void save(Student theStudent);

    Student findById(Integer id);

    List<Student> findByLastName(String theLastName);

    List<Student> findAll();

    void update(Student theStudent);
}
