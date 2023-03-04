package example.personalproject.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import example.personalproject.topic.Topic;

/* @Entity indicate the class that its objects will be treated as rows on the database 
, which mean objects can be saved, retrieved, update, and delete on the database */
@Entity
public class Course {
	// Primary key
	@Id
	String name;
	String description;
	@ManyToOne
	Topic topic;
	
	public Course() {
		
	}
	
	public Course(String name, String description, Topic topic) {
		super();
		this.name = name;
		this.description = description;
		this.topic = topic;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Topic getTopic() {
		return topic;
	}
	public void setTopic(Topic topic) {
		this.topic = topic;
	}

}
