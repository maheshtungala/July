package inheritance;
class Employee{
	double sal=10000;  //attribute
	double hike(){
		return(sal*0.40);
	}
}
public class Programmer extends Employee {
   double bonus=sal*0.12;  
	public static void main(String[] args) {
		Programmer p = new Programmer();
		System.out.println("the total salary of P is " + (p.sal+p.bonus));
		System.out.println("the new salary of P is " +(p.sal+p.bonus+p.hike()));

	}

}
