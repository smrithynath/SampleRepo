package Collection;

import java.util.ArrayList;
import java.util.List;

public class Nongenericlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
ArrayList<String> a = new ArrayList<String>();
a.add("Black");
a.add("white");
a.add("orange");
a.add("green");
System.out.println(a);
System.out.println(a.get(1));
a.set(2, "Red");
System.out.println(a);
System.out.println(a.indexOf("Black"));
System.out.println(a.lastIndexOf("green"));
a.remove(2);
System.out.println(a);
System.out.println(a.contains("green"));
System.out.println(a.isEmpty());
System.out.println(a.size());
	}

}
