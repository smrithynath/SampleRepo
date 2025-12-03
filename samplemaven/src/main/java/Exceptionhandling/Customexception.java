package Exceptionhandling;

public class Customexception {

	public static void main(String[] args) throws VotingException {
		// TODO Auto-generated method stub
		int age = 19;
		if (age>18)
		{
			System.out.println("Eligible for Voting");
		}
		else
		{
			throw new VotingException("Age under 18!!");
		}
			}
	}


