package collections;
import java.util.*;
public class Linkedhashset {

	public static void main(String[] args) {
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("Mahesh");
		lhs.add("Anjani");
		lhs.add("Ambica");
		lhs.add("Sharmila");
		lhs.add("Mahesh");
		
		Iterator itr = lhs.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}
