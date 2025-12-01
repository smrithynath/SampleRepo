package Abstraction;

public class Abstractchild extends Abstractparent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstractchild obj = new Abstractchild();
		obj.display();
		obj.print();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Abstratct Class");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Java");
	}

}
