package statics;

public class PlayerTest {
	String name;
	static int count=0;
	PlayerTest(String name){
		this.name=name;
		count++;
	}

	public static void main(String[] args) {
		PlayerTest one = new PlayerTest("Mike Jordan!");
		System.out.println("The player count is " +count);
		
		PlayerTest two = new PlayerTest("Usain Bolt!");
		System.out.println("The player count is " +count);

	}

}
