package Aggregation;

public class Child {
	String city;
	String state;
	Parent ref;
public Child(String city, String state, Parent ref) {
	
	this.city =city;
	this.state = state;
	this.ref = ref;
}
public void display() {
	System.out.println("Name; = "+ ref.name);
	System.out.println("rollno: "+ref.rollno);
	System.out.println("address: "+ ref.address);
			System.out.println("city:"+ city);
			System.out.println("state :" +state);
	

}
public static void main(String [] args) {
	Parent obj = new Parent("Smrithy", 30, "PKD");
	Child obj2 = new Child ("Qatar", "Doha", obj);
	obj2.display();
	
}
}
