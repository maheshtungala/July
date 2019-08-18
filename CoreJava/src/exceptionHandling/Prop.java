package exceptionHandling;

public class Prop {
    void a(){
    	int x=10;
    	System.out.println(x/0);
    }
    void b(){
    	a();
    }
    void c(){
    	b();
    }
	public static void main(String[] args) {
		Prop p = new Prop();
		p.c();

	}

}
