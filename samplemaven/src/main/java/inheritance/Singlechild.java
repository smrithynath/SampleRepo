package inheritance;

public class Singlechild extends Singleparent {
	
public void print()
{
	System.out.println("parent class");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Singlechild obj = new Singlechild();
obj.print();
obj.display();
	}

}
	