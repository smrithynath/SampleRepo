package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<String> s = new HashSet<String>();
s.add("Apple");
s.add("Orange");
s.add("Grapes");
System.out.println(s);
Iterator it = s.iterator();
while(it.hasNext())
{
	System.out.println(it.next());
}
it.remove();
System.out.println(s);
	
}
	}


