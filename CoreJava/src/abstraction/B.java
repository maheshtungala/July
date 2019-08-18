package abstraction;
class A{
	static void hello(){
		System.out.println("Hello from A!");
	}
	void hai(){
		System.out.println("Hai from A!");
	}
}

public class B{

	public static void main(String[] args) {
		A.hello();
        
	}

}
