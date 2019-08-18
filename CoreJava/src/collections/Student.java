package collections;
import java.util.*;
public class Student {
    int rollno;
    String name;
    Student(int rollno,String name){
    	this.rollno=rollno;
    	this.name=name;
    }
	public static void main(String[] args) {
		Student s1 = new Student(1111,"Mahesh");
		Student s2 = new Student(2222,"Anjani");
		Student s3 = new Student(3333,"Ambica");
		
		//create a collection of students
		ArrayList<Student> st = new ArrayList<Student>();
		st.add(s1);
		st.add(s2);
		st.add(s3);
		
		//using iterator interface..
		Iterator itr = st.iterator();
		while(itr.hasNext()){
			Student s=(Student) (itr.next());
			System.out.println(s.rollno+" "+s.name);
		}

	}

}
