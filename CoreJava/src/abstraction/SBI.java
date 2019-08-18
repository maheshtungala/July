package abstraction;
abstract class Amazon{
	abstract void pay();
	static void welcome(){
		System.out.println("Welcome to Amazon!");
	}
}
class Axis extends Amazon{
	void pay(){
		System.out.println("Payment successful");
	}
}
public class SBI extends Amazon{
	void pay(){
		System.out.println("Payment successful");
	}
	public static void main(String[] args) {
		
		Amazon a = new Axis();  //reference object...
		welcome();
		a.pay();
		
		Amazon s = new SBI();  //refernce object...
		s.pay();

	}

}
