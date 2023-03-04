package example.personalproject.course;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import example.personalproject.topic.Topic;

/* @Service is the specialization of the @Component, indicating the CourseService class will contain
business services */
@Service
public class CourseService {
	// Dependency injection, injecting the appropriate object when initialize this class's object 
	@Autowired
	private CourseRepository courseRepository;
	
	/* Business services, utilizing methods from the CourseRepository object for interacting with data
	 on the database */
	public List<Course> getAllCourses(){
		List<Course> courses = new ArrayList<>();
		courseRepository.findAll().forEach(t -> courses.add(t));
		return courses;
	}
	
	public List<Course> getCoursesByTopic(String topicName){
		List<Course> courses = new ArrayList<Course>();
		courseRepository.findByTopicName(topicName).forEach(courses::add);
		return courses;
	}
	
	public Optional<Course> getCourse(String name){
		return courseRepository.findById(name);
	}
	
	public void createCourse(Course course) {
		courseRepository.save(course);
	}
	
	public void updateCourse(String topicName ,String courseName, String description) {
		courseRepository.save(new Course(courseName, description, new Topic(topicName, "")));
	}
		
	
	public void deleteCourse(String name) {
		courseRepository.deleteById(name);
	}

}
