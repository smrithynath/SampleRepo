package inheritance;

public class Multiplechild implements Multipleparent2, Multipleparent1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multiplechild obj = new Multiplechild();
	obj.display();
	obj.print();
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("this is parent1");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("This is parent2");
	}

}
