package inheritance;

public class Son2 extends Son1 {
public void display()
{
	super.display();
	System.out.println("This is child2");
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Son2 obj = new Son2();

obj.display();
	}

}
