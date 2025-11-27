package Superkeyword;

public class Supervariablechild extends Supervariableparent {

	String s = "Black";
	public void display()
	{
		System.out.println(s);
		System.out.println(super.s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supervariablechild obj = new Supervariablechild();
		obj.display();
	}
}