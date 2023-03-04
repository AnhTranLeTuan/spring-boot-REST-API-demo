package example.personalproject.topic;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

// @RestController indicating this class is the controller for the REST API
/* This annotation also like @Controller, is the specialization of the @Component,
 mark it as the bean for auto-detection */
@RestController
public class TopicController {
	// Dependency injection, injecting the appropriate object when initialize this class's object 
	@Autowired
	public TopicService topicService; 

	// This annotation maps the specific URL with the specific method 
	@RequestMapping("/topics")
	/* The returned value in this case is List<Topic> that will be automatically converted to
	 JSON format for responding to the request */
	public List<Topic> getTopics(){
		return topicService.getTopics();
	}
	
	/* In this case, we can retrieve the value from {name} with @Pathvariable and put it 
	 into the parameter for retrieving a specific topic */
	@RequestMapping("/topics/{name}")
	public Optional<Topic> getTopic(@PathVariable String name){
		return topicService.getTopic(name);
	}
	
	/* In this case, @RequestMapping will map both specific URL and the HTTP method for the 
	 specific method */
	/* @RequestBody is for retrieving the Topic value (in this case, in the JSON format) and 
	 convert this value to the appropriate format for Java */
	@RequestMapping(method = RequestMethod.POST, value = "/topics")
	public void createTopic(@RequestBody Topic topic) {
		topicService.createTopic(topic);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/topics/{name}")
	public void updateTopic(@PathVariable String name, @RequestBody String description) {
		topicService.updateTopic(name, description);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/topics/{name}")
	public void deleteTopic(@PathVariable String name) {
		topicService.deleteTopic(name);
	}

}
