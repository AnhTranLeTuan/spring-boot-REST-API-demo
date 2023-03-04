package example.personalproject.course;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//@RestController indicating this class is the controller for the REST API
/* This annotation also like @Controller, is the specialization of the @Component,
mark it as the bean for auto-detection */
@RestController
public class CourseController {
	// Dependency injection, injecting the appropriate object when initialize this class's object 
	@Autowired
	public CourseService courseService; 
	
	// This annotation maps the specific URL with the specific method 
	@RequestMapping("/topics/courses")
	/* The returned value in this case is List<Topic> that will be automatically converted to
	 JSON format for responding to the request */
	public List<Course> getCourses(){
		return courseService.getAllCourses();
	}
	
	/* In this case, we can retrieve the value from {name} with @Pathvariable and put it 
	 into the parameter for retrieving a specific topic */
	@RequestMapping("/topics/courses/{name}")
	public Optional<Course> getCourse(@PathVariable String name){
		return courseService.getCourse(name);
	}
	
	@RequestMapping("/topics/{name}/courses")
	public List<Course> getCoursesByTopic(@PathVariable String name){
		return courseService.getCoursesByTopic(name);
	}
	
	/* In this case, @RequestMapping will map both specific URL and the HTTP method for the 
	 specific method */
	/* @RequestBody is for retrieving the Topic value (in this case, in the JSON format) and 
	 convert this value to the appropriate format for Java */
	@RequestMapping(method = RequestMethod.POST, value = "/topics/courses")
	public void createCourse(@RequestBody Course course) {
		courseService.createCourse(course);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/topics/{topicName}/courses/{courseName}")
	public void updateCourse(@PathVariable String topicName, @PathVariable String courseName , @RequestBody String description) {
		courseService.updateCourse(topicName, courseName, description);
	} 
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/topics/courses/{name}")
	public void deleteCourse(@PathVariable String name) {
		courseService.deleteCourse(name);
	}

}
