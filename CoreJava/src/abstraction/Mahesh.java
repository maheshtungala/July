package abstraction;
interface Testing{
	public void testing();
	static void welcome(){
		System.out.println("Welcome to Qaplanet!");
	}
}
interface Selenium extends Testing{
	public void selenium();
	static void welcome(){
		System.out.println("Welcome to Selenium!");
	}
}
abstract class Qaplanet implements Selenium{
	abstract void work();
	public void testing(){
    	System.out.println("Mahesh teaches Testing!");
    }
    public void selenium(){
    	System.out.println("Mahesh also teaches Selenium!");
    }
}
public class Mahesh extends Qaplanet  {
	void work(){
		System.out.println("Mahesh works for Qaplanet!");
	}
    
	public static void main(String[] args) {
		Mahesh m = new Mahesh();
		Testing.welcome();
		Selenium.welcome();
		m.work();
		m.testing();
		m.selenium();

	}

}
