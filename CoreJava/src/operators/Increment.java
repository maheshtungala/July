package operators;

public class Increment {

	public static void main(String[] args) {
		int x=10;
		System.out.println(x++);  //prints 10
		
		System.out.println(++x);  //prints 12
		
		System.out.println(x++ + ++x);  //prints 26
		
		System.out.println(x);  //prints 14

	}

}
