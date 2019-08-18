package oops;
public class Student {
	int rollno;
    String name;
    String city;
    
    Student(){
    	
    }
    Student(int rollno,String name){
    	this.rollno=rollno;
    	this.name=name;
    }
    Student(int rollno,String name,String city){
    	this.rollno=rollno;
    	this.name=name;
    	this.city=city;
    }
    void print(){
    	System.out.println(rollno+" "+name+" "+city);
    }
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student(1111,"Anjali");
		Student s3 = new Student(2222,"Ambica","Hyderabad");
		
		s1.print();
		s2.print();
		s3.print();
	}

}
