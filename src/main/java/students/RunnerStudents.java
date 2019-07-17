package students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class RunnerStudents {

	public static void main(String[] args) {
		
		ArrayList<Student> groupStudent= new ArrayList<Student>();
		
		HashMap<String, Integer> marksHashMapStudent1 = new HashMap<String, Integer>();
			marksHashMapStudent1.put("Math", 3);
			marksHashMapStudent1.put("Fiz", 4);
			marksHashMapStudent1.put("Hist", 5);
			marksHashMapStudent1.put("Che", 4);
			marksHashMapStudent1.put("Lit", 5);
        
		HashMap<String, Integer> marksHashMapStudent2 = new HashMap<String, Integer>();
			marksHashMapStudent2.put("Math", 3);
			marksHashMapStudent2.put("Fiz", 4);
			marksHashMapStudent2.put("Hist", 3);
			marksHashMapStudent2.put("Che", 3);
			marksHashMapStudent2.put("Lit", 5);
		
		HashMap<String, Integer> marksHashMapStudent3 = new HashMap<String, Integer>();
			marksHashMapStudent3.put("Math", 3);
			marksHashMapStudent3.put("Fiz", 4);
			marksHashMapStudent3.put("Hist", 5);
			marksHashMapStudent3.put("Che", 4);
			marksHashMapStudent3.put("Lit", 3);
			
		HashMap<String, Integer> marksHashMapStudent4 = new HashMap<String, Integer>();
			marksHashMapStudent4.put("Math", 3);
			marksHashMapStudent4.put("Fiz", 3);
			marksHashMapStudent4.put("Hist", 5);
			marksHashMapStudent4.put("Che", 4);
			marksHashMapStudent4.put("Lit", 5);
		
		Student student1 = new Student("Ivan", "Ivanov", "Ivanovich", 4, 23, 3,marksHashMapStudent1);
		Student student2 = new Student("Petr", "Petrov", "Ivanovich", 4, 21, 3,marksHashMapStudent2);
		Student student3 = new Student("Gvan", "Getrov", "Ivanovich", 2, 20, 2,marksHashMapStudent3);
		Student student4 = new Student("Van", "Vanov", "Ivanovich", 1, 23, 1,marksHashMapStudent4);
		
		groupStudent.add(student1);
		groupStudent.add(student2);
		groupStudent.add(student3);
		groupStudent.add(student4);
		
		for(int i=0;i<groupStudent.size();i++){
		    System.out.println(groupStudent.get(i).name);
		} 
		
		groupStudent.sort(Comparator.comparing(Student::getCourse));
		
		for(int i=0;i<groupStudent.size();i++){
		    System.out.println(groupStudent.get(i).name);
		}
		
		
		for(int i=0;i<groupStudent.size();i++){
		    System.out.println(groupStudent.get(i).marksHashMap);
		} 
		
		
		
		


	}

}
