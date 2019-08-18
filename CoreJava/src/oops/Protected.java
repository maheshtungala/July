package oops;

public class Protected {
    protected int x=10;
    protected void print(){
    	System.out.println(x*2);
    }
	public static void main(String[] args) {
		Protected p = new Protected();
		System.out.println(p.x);
		p.print();

	}

}
