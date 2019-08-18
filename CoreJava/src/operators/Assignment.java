package operators;

public class Assignment {

	public static void main(String[] args) {
		//int a=b=c=d;
		int a,b,c,d;
		
		a=b=c=d=10;  
		System.out.println(a);
		
		b=a+b;
		System.out.println(b);
		
		System.out.println(c);
		
		d=a+b+c;
		System.out.println(d);

	}

}
