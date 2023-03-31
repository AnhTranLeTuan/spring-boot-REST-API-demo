# Spring Boot For REST API

## Description
Experiment with concepts of Spring Boot, Maven, and REST API. In this project, we can see how:
* Create a Spring Boot project based on Maven (/spring-boot-REST-API-demo/pom.xml)
  * Utilize the project inheritance feature of Maven to inherit all configurations in the project "spring-boot-starter-parent" for Spring Boot (This parent project     contain information about the versions of JAR files of below dependencies)
  * Utilize the provided dependencies from Spring Boot which each of them contain the collection of required dependencies or JAR files, allow us don't have to list all of them manually
  * these dependencies only contain information for the list of JAR files that will be downloaded by Maven, but the information about their versions will need to be obtained from the parent project
  
NOTE: The below files will start from (/spring-boot-REST-API-demo/src/main/java/example/personalproject/...)
* Create entities in which Java classes or their objects will be mapped to the database's table (.../course/Course.java) (.../topic/Topic.java)
* Create services which are classes that contain business services (.../course/CourseService.java) (.../topic/TopicService.java)
* Create repositories which are classes responsible for the mechanism for storage, retrieval, search, update and delete operation on objects
* Create controllers (.../course/CourseController.java) (.../topic/TopicController.java)
  * Map URLs to the approriate functions
  * Retrieve data from URLs and its associated information (in this case, in the JSON format) for allowing functions to work
  * Return data retrieved from the database, and Spring Boot will automatically convert these data into JSON format for users
* Allow component scan and run the Spring Boot application (.../PersonalprojectApplication.java)
