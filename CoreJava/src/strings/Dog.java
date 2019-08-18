package strings;
public class Dog {
    String name;
    
    Dog(String name){
    	this.name=name;
    }
    
    void bark(){
    	System.out.println(name+ " says WoW");
    }
    
public static void main(String args []) {
	Dog d1=new Dog("Scooby"),
			d2=new Dog("Rambo"),
			  d3=new Dog("Whoophy");
	
	//create an array of dogs..
	Dog [] s=new Dog[3];
	
	//put the dogs into the array...
	s[0]=d1;
	s[1]=d2;
	s[2]=d3;
	
	//tell all the dogs to bark...thru the array...
	for(int i=0;i<s.length;i++){
	    s[i].bark();	
	}
 }
}
