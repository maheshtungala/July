package datatypes;

public class Array {

	public static void main(String[] args) {
		int a[]=new int[3];
		
		a[0]=12;
		a[1]=23;
		a[2]=34;
		
		System.out.println(a[2]);
        System.out.println(a.length);
        
        
        //alternatively...
        int b[]={1,2,3,4,5};
        System.out.println(b[3]);
        System.out.println(b.length);
        
	}

}
