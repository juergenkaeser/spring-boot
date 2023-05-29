package de.juristan.cruddemo;

import de.juristan.cruddemo.dao.AppDAO;
import de.juristan.cruddemo.entity.Instructor;
import de.juristan.cruddemo.entity.InstructorDetail;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AppDAO appDAO) {

		return runner -> {
			createInstructor(appDAO);
		};
	}

	private void createInstructor(AppDAO appDAO) {
		// create the instructor
		Instructor tempInstructor = new Instructor("Juri", "Stan", "juri@juristan.de");

		// create the instructor detail
		InstructorDetail tempInstructorDetail = new InstructorDetail("juristan.de/youtube", "BJJ");

		// associate the objects
		tempInstructor.setInstructorDetail(tempInstructorDetail);

		// save the instructor (this will also save the details object because of CascadeType.ALL)
		System.out.println("Saving the instructor: " + tempInstructor);
		appDAO.save(tempInstructor);
		System.out.println("Instructor saved!");
	}

}
