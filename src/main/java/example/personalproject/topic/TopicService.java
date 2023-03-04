package example.personalproject.topic;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/* @Service is the specialization of the @Component, indicating the TopicService class will contain
 business services */
@Service
public class TopicService {
	// Dependency injection, injecting the appropriate object when initialize this class's object 
	@Autowired
	private TopicRepository topicRepository;
	
	/* Business services, utilizing methods from the TopicRepository object for interacting with data
	 on the database */
	public List<Topic> getTopics(){
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll().forEach(t -> topics.add(t));
		return topics;
	}
	
	public Optional<Topic> getTopic(String name){
		return topicRepository.findById(name);
	}
	
	public void createTopic(Topic topic) {
		topicRepository.save(topic);
	}
	
	public void updateTopic(String name, String description) {
		topicRepository.save(new Topic(name, description));
	}
	
	public void deleteTopic(String name) {
		topicRepository.deleteById(name);
	}
	
}
