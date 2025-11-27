package inheritance;

public class Child extends Multilevelparent{
public void display()
{
	super.display();
	System.out.println("this is child");
	
}
public static void main(String[] args) {
	Child obj = new Child();

	obj.display();
	
}

	
}
