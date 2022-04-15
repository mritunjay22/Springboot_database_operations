package bootStart_Controller;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface SubjectsRepository extends CrudRepository <Subjects,String> {
// basic CRUD OPERATIONS LIKE Standard Crud operations
	// Spring data JPA is goona provide a class and this interface will extends and inherit all basic CRUD operations
  // but this repository is Generic type so it needs to privide generic type information
	// information needs to provide is 
//	1) What is the entity class you are working on in out case its Subjects
//	2) type of id that this entity class have
	
	
//	Just Declare the method with the findByProperty name format and any the Spring Data jpa will implement the method for you
	//make sure you always write method name in camel-case
	
//	public Subjects findByid(String id);
	public List<Subjects> findBysub(String sub);
	
	
	
}
