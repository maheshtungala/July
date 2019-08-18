package variables;

public class Static {
    static int s=100;  //static variable
    void print(){
    	s=s*2;
    	System.out.println("Calling static variable from instance method " +s);  
    }
public static void main(String[] args) {
		System.out.println("Calling the static variable from main " + s);
		
           Static obj = new Static();
           obj.print();
           
           System.out.println("Calling the static variable from main " + s);
           
           obj.print();
	}

}
