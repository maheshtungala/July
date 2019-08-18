package exceptionHandling;

public class TryCatch {

	public static void main(String[] args) {
		int a[]={1,2,3};
		try{
		System.out.println(a[3]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Invalid index!");
		}
		catch(IllegalStateException e){
			System.out.println(e);
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		finally{
			System.out.println("Executing the finally block!");
		}
		
		System.out.println("Hello");
		System.out.println("World");
	}

}
