package variables;

public class Instance {
    int i = 10;  //instance variable...
    void print(){  //instance method...
       System.out.println(i*2);	 
    }
	public static void main(String[] args) {
		Instance obj = new Instance();   //object creation
		System.out.println(obj.i);
       // System.out.println();
		obj.print();
	}

}
