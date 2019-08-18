package oops;

public class Car {
    public int year;
     public String model;
    
    
    void start(){
    	System.out.println("Car started!");
    }
    void run(){
    	System.out.println("Car is running!");
    }
    void stop(){
    	System.out.println("Car stopped!");
    }
   public  void print(){
    	System.out.println(year+" "+model);
    }
	public static void main(String[] args) {
		Car maruti=new Car();
		maruti.year=1985;
		maruti.model="800 classic";
		
		System.out.println(maruti.year+" "+maruti.model);
		//maruti.print();
		System.out.println(maruti);
		maruti.start();
		maruti.run();
		maruti.stop();
		
		System.out.println(maruti);

	}

}
