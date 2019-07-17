package students;



import java.util.HashMap;



public class Student  {

	
	public  String name;
	public  String surname;	
	public  String secondName;
	public int age;
	public int course;
	public int groupe;
	
	public HashMap<String, Integer> marksHashMap ;

	public Student(String name, String surname, String secondName, int course, int age, int groupe, HashMap<String, Integer> marksHashMap) {
		this.name = name;
		this.surname = surname;
		this.secondName = secondName;
		this.age = age;
		this.course = course;
		this.groupe = groupe;

	}
	
	  public int getAge() {
		    return age;
	  }
	  
	  public int getCourse() {
		    return course;
	  }
	  



}
