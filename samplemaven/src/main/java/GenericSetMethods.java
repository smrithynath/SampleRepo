import java.util.HashSet;
import java.util.Set;

public class GenericSetMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<String> a = new HashSet<String>();
a.add("Blue");
a.add("Green");
a.add("Red");
System.out.println(a);
Set<String> b = new HashSet<String>();
b.add("White");
b.add("Yellow");
System.out.println(b);
a.addAll(b);
System.out.println(a);
System.out.println(a.contains("Green"));
System.out.println(a.containsAll(b));
System.out.println(a.isEmpty());
a.remove("red");
System.out.println(a);
a.removeAll(b);
System.out.println(a);
System.out.println(a.size());
b.clear();
System.out.println(b);

	}

}
