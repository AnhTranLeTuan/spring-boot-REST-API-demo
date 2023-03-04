package example.personalproject.course;

import java.util.List; 

import org.springframework.data.repository.CrudRepository;

/* From extending the CrudRepository interface, Spring Boot will also help us to
implement these functions, allowing us to interact with the database */
public interface CourseRepository extends CrudRepository<Course, String>{
	
	public List<Course> findByTopicName(String name);
	
}
