package example.personalproject;

import org.springframework.boot.SpringApplication; 
import org.springframework.boot.autoconfigure.SpringBootApplication;

// This annotation indicate this is the Spring Boot application
// It also contain @ComponentScan, enabling component scan on the class path
@SpringBootApplication
public class PersonalprojectApplication {

	public static void main(String[] args) {
		// The static method for running the Spring Boot application
		/* It include everything needed for this applciation to run, even the deployment of
		 the servlet container, with the default option is Tomcat */
		SpringApplication.run(PersonalprojectApplication.class, args);
	}

}
