package Collection;

import java.util.HashSet;
import java.util.Set;

public class Genericsetmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set <String> a = new HashSet <String> ();
a.add("Apple");
a.add("Orange");
a.add("Green");
a.add("Blue");
Set<String> b = new HashSet<String>();
b.add("Grapes");
b.add("Violet");
a.addAll(b);
System.out.println(a);
System.out.println(a.containsAll(b));
System.out.println(b.containsAll(a));
System.out.println(a.isEmpty());
System.out.println(a);
System.out.println(a.remove("Green"));
System.out.println(a);
System.out.println(a.removeAll(b));
System.out.println(a);
System.out.println(a.size());
a.clear();
System.out.println(a);








	}

	private static char[] size() {
		// TODO Auto-generated method stub
		return null;
	}

	private static void remove(String string) {
		// TODO Auto-generated method stub
		
	}

	private static void Contains() {
		// TODO Auto-generated method stub
		
	}

}
