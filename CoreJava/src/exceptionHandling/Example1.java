package exceptionHandling;

public class Example1 {

	public static void main(String[] args) throws InterruptedException {
		int i=10;
		Thread.sleep(3000);
		System.out.println(i/0);
		
		System.out.println("Hello");
		System.out.println("World");

	}

}
