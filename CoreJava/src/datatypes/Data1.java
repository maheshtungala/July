package datatypes;

public class Data1 {

	public static void main(String[] args) {
		int i=10;
		byte b=10;
		
		i=b;
		//b=i;
		
		double d=1232132132;
		System.out.println(d);
		
		long l=999999999;
		
		char c='a';
		
		System.out.println(c);
		System.out.println((int)c);   //ASCII value of the character 'a'
		
		int x=(int)c;
		System.out.println(x);
		
		System.out.println((char)x);  //typecasting...

	}

}
