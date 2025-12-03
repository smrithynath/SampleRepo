package Exceptionhandling;

public class Throwexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age = 19;
if (age>18)
{
	System.out.println("Eligible for Voting");
}
else
{
	throw new ArithmaticException ("age under 18!!");
}
	}

}
