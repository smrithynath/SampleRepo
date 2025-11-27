package practiseinheritance;

public class Daughter extends Mother{
public void display()
{
	super.display();
	System.out.println("This is Child");
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Daughter obj = new Daughter();

obj.display();

	}

}
