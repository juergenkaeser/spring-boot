package de.juristan.cruddemo.dao;

import de.juristan.cruddemo.entity.Instructor;

public interface AppDAO {

    void save(Instructor theInstructor);

    Instructor findInstructorByID(int theId);
}
