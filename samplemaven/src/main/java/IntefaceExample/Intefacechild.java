package IntefaceExample;

public class Intefacechild implements Intefaceparent {
	
public void show()
{
	System.out.println("Inteface");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Interfacename objname = new classname(); // reference creation
		Intefaceparent obj1 = new Intefacechild();
		obj1.display();
		obj1.print();
		
		/* Intefacechild obj = new Intefacechild();
		obj.display();
		obj.print();
		obj.show();*/
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("This is inteface");
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Java");
	}

}
