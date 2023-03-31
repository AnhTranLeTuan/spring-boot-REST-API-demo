package example.personalproject.course;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/* From extending the CrudRepository interface, Spring Boot will also help us to
implement these functions, allowing us to interact with the database */
@Repository
public interface CourseRepository extends CrudRepository<Course, String>{
	
	public List<Course> findByTopicName(String name);
	
}
