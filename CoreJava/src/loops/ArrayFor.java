package loops;

public class ArrayFor {

	public static void main(String[] args) {
		int a[]={1,2,3,4,5};
		
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
			if(a[i]==3)break;
		}
		
		String st[]={"anjali","raj","mahesh","qaplanet","hyderabad"};
		
		for(int i=0;i<st.length;i++){
			System.out.println(st[i]);
		}

	}

}
