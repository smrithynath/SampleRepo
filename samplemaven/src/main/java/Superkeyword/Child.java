package Superkeyword;

public class Child extends Parent{

	public void display()
	{
		System.out.println("Child class");
		super.display();
	}
	public static void main(String args[])
	{
		Child obj = new Child();
		obj.display();

	}

}
