package Collection;

import java.util.ArrayList;
import java.util.List;

public class GenericListmetods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> a = new ArrayList<String>();
a.add("green");
a.add("blue");
a.add("red");
a.add("green");
System.out.println(a);
System.out.println(a.get(1));
a.set(2, "brown");
System.out.println(a);
System.out.println(a.indexOf("red"));
System.out.println(a.lastIndexOf("red"));
a.remove(2);
System.out.println(a);
System.out.println(a.contains("blue"));
System.out.println(a.isEmpty());
System.out.println(a.size());

	}

}
