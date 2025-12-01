package practiseinheritance;

public class LinearSearch {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		


		int a[] = {1,2,3,4,5,6};
		int target = 4;
		int index = -1;
		for (int i =0; i<a.length; i++)
		{
			 if (a[i] == target) {
		         index = i;
		         break;
		}
	}
		 if (index != -1) {
	            System.out.println("value found at position: " + index);
	        } else {
	            System.out.println("value not found.");
	        }
	    }
	}



