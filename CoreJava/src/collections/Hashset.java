package collections;
import java.util.*;
public class Hashset {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("Mahesh");
		hs.add("Anjani");
		hs.add("Ambica");
		hs.add("Sharmila");
		hs.add("Mahesh");
		
		Iterator itr = hs.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}

	}

}
