package constructs;

public class Swtich {

	public static void main(String[] args) {
		int marks=6;		
		switch(marks){
		
		case 50 : System.out.println("Second class");
		          break;
		          
		case 60 : System.out.println("First class");          
		          break;
		          
		case 70 : System.out.println("Distinction"); 
		          break;
		          
		default  : System.out.println("Invalid or failed!");
		           
		}
		System.out.println("After switching!");
	}

	

}
