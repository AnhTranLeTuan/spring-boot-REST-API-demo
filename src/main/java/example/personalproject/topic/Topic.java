package example.personalproject.topic;

import javax.persistence.Entity;
import javax.persistence.Id;

/* @Entity indicate the class that its objects will be treated as rows on the database 
 , which mean objects can be saved, retrieved, update, and delete on the database */
@Entity
public class Topic {
	// Primary key 
	@Id
	String name;
	String description;
	
	public Topic() {
		
	}
	
	public Topic(String name, String description) {
		this.name = name;
		this.description = description;
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

}
