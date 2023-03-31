package example.personalproject.topic;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/* From extending the CrudRepository interface, Spring Boot will also help us to
 implement these functions, allowing us to interact with the database */
@Repository
public interface TopicRepository extends CrudRepository<Topic, String>{
	

}
