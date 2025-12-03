package Exceptionhandling;

public class CustomException1 {

	public static void main(String[] args) throws AgeException {
		// TODO Auto-generated method stub
		int age = 19;
		if (age>18)
		{
			System.out.println("Eligible Voting");
		}
		else
		{
			throw new AgeException("Age under 18!!");
		}
			}
	}

	