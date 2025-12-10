package Collection;

import java.util.HashSet;

public class Nongenericsetmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
HashSet<String> s = new HashSet <String> ();
s.add("Blue");
s.add("green");
s.add("violet");
s.add("Black");
HashSet<String> t = new HashSet<String>();
t.add("Red");
t.add("White");
s.addAll(t);
System.out.println(s);
System.out.println(s.containsAll(t));
System.out.println(t.containsAll(s));
System.out.println(s.isEmpty());
System.out.println(s);
System.out.println(s.remove("Violet"));
System.out.println(s);
System.out.println(s.removeAll(t));
System.out.println(s);
System.out.println(s.size());
s.clear();
System.out.println(s);



		



	}

}
