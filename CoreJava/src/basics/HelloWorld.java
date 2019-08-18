package basics;
import oops.*;
//import oops.Car;
public class HelloWorld extends Protected {
    void  hello(){
    	 System.out.println("Hello");
     }
    int value(){
    	return 10;
    }
   int add(int a,int b){
	   return(a+b);
    	
    }
	static public  void main(String... args) {
    /*   Car maruti = new Car();
       maruti.year=2015;
       maruti.model="Baleno";
       
       maruti.print(); */
		
		HelloWorld h = new HelloWorld();
		System.out.println(h.x);
		h.print();
		
	}

}
