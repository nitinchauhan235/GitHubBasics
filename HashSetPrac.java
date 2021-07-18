import java.util.HashSet;
import java.util.Iterator;



public class HashSetPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> s = new HashSet<String>();
		s.add("nitin");
		s.add("sayani");
		s.add("nitin");
			
		HashSet<String> s1 = new HashSet<String>();
		s1.add("babu");
		s1.add("gudiya");
		s.addAll(s1);
		Iterator it = s.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		s.removeAll(s1);
		Iterator it1 = s.iterator();
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
		
	}

}
