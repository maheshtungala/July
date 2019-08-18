package collections;
import java.util.*;
public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Mahesh");
		al.add("Anjani");
		al.add("Ambica");
		al.add("Sharmila");
		al.add("Mahesh");
		
		//System.out.println(al.get(3));
		
		//using for each loop..
		for(String s:al){
			System.out.println(s);
		}
	System.out.println("***************************");	
		//using iterator interface
		Iterator itr = al.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}

	}

}
