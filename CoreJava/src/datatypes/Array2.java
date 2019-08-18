package datatypes;

public class Array2 {
    int a[]=new int[3];
 /*   {
    a[0]=12;
    a[1]=23;
    a[2]=34;
    }  */
	public static void main(String[] args) {
		Array2 obj = new Array2();
		
		obj.a[0] = 12;
		obj.a[1] = 23;
		obj.a[2] = 34;
		
		//fetch the length of the array...
		System.out.println(obj.a.length);

	}

}
