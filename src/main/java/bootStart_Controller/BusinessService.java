package bootStart_Controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service    // Alternate We Can Use @Component
public class BusinessService {
	
	@Autowired                                     //automatic dependency injection
	private SubjectsRepository subjectRepository;  // dependency injection
	
//private List<Subjects> subAuto =   new ArrayList<>(Arrays.asList(             // new and after arrayList to make this mutable so that we can add and remove things later
//		new Subjects("1","JAVA","HELLO JAVA DEV"),
//		new Subjects("2","Python","HELLO Python DEV"),
//		new Subjects("3","RUBY","HELLO RUBY DEV"),
//		new Subjects("4","PHP","HELLO PHP DEV")
//		));    //SO this is not needed now because we are interacting with database
	

// it will just return the all existing element in the List
	public List<Subjects> getAllTopics(){
		//return subAuto;
		List<Subjects> sub = new ArrayList<>();
		subjectRepository.findAll().forEach(sub::add);    //here method reference for each element found by findAll will be Added to ArrayList sub
		// this all we have to do to connect to database , run a query,getallSubjects , convert each that rows into topic instances and get it back
		// here this is iterable and we have to convert it into a list soooooooooo
		//now we will just return it
		return sub;
		
	}
	
	
	
	// its for Searching the whole List and finding the specific entry/ value
	public Optional<Subjects> getSingleSubject(String id) {
		//return	subAuto.stream().filter(t -> t.getS_no().equals(id)).findFirst().get();
		
	return	subjectRepository.findById(id);
		}
	
	
	
	//its for adding the new object/ instance/ value to the List
	public void addSubject(Subjects rec) {    // this will rec a object of Subject and will add to the above existing lIst
		//subAuto.add(rec);
		subjectRepository.save(rec);    //this CurdRepository method will add the new value to the database above line is the hardcoded line and this is derby database empty
		System.out.println("Subject Succesfully ADDED");
		
		}
	
	
	// its for updating the specific index with the new Object/ instance/ valve
		public void updateSubject(Subjects forUpdate, String id) {
//	    for(int i =0;i<subAuto.size();i++) {        // its goona Loop Through  every element in the List of subAuto  and find that  index id and goona update that index only
//	    	Subjects s = subAuto.get(i);             // subAuto above is the List of Subjects class/POJO class
//	    	if(s.getS_no().equals(id)) {        
//	    		subAuto.set(i,forUpdate);    // here when we find the specific index and update that specific indexxxxxxxxx
//	    		System.out.println("Subject Succesfully UPDATED");
//	    		return;
//	    	}
//	    	
//	    }
	
			subjectRepository.save(forUpdate);   // CurdRepo is Smart enough if this instance as row already exist its goona update it and if not
			                                   // then that same command goona insert it 
											// see in Subjects s_no is ID which will compare and Update
			System.out.println("SUCCESSFULLY UPDATED");
			
				}


     // this is to DELETE the existing entry from the List by its ID
		public void deleteSubject(String id) {
//			subAuto.removeIf(t -> t.getS_no().equals(id));       //Lamda Expression
			subjectRepository.deleteById(id);   // this line will Delete the entry by its id from existing
			System.out.println("Subject Succesfully REMOVED");
			
		}

		public List<Subjects> getByDes(String des){
			return subjectRepository.findBysub(des);
			
			
		}


}
