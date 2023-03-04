package example.personalproject.topic;

import org.springframework.data.repository.CrudRepository;

/* From extending the CrudRepository interface, Spring Boot will also help us to
 implement these functions, allowing us to interact with the database */
public interface TopicRepository extends CrudRepository<Topic, String>{
	

}
