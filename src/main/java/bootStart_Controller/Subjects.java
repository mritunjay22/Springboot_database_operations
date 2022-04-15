package bootStart_Controller;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity  // it tells that this is the thing that needs to be save in database and @Entity declare it and all the instance/value act as rows
@Table(name="Subjects")                  //it is to define the table name to be created in database
public class Subjects {                  // and all the member Variable Act as coloumb values
	                           // to map objects of this topic class in database
@Id   // this id means primary key in database  
//@GeneratedValue(strategy = GenerationType.AUTO)  //it is the Auto Increment By Annotation in Database but but wait String cannot be Auto Incremented
private String s_no;
	// now this can convert a Subjects instance/ object to database table and opposite also
private String sub;
private String des;


//POJO CLASS TO RETURN LIST OF OBJECTS OF SUBJECTS




public Subjects() {
	//Default
}


public Subjects(String s_no, String sub, String des) {
	super();
	this.s_no = s_no;
	this.sub = sub;
	this.des = des;
}
public String getS_no() {
	return s_no;
}
public void setS_no(String s_no) {
	this.s_no = s_no;
}
public String getSub() {
	return sub;
}
public void setSub(String sub) {
	this.sub = sub;
}
public String getDes() {
	return des;
}
public void setDes(String des) {
	this.des = des;
}


}
