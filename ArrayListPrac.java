import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> l1 = new ArrayList<String>();
		l1.add("Nitin");
		l1.add("Sayani");
		
		Iterator it = l1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		for(int i=0;i<=l1.size()-1;i++)
		{
			System.out.println(l1.get(i));
		}
		
		for(String s:l1)
		{
			System.out.println(s);
		}
		
		System.out.println(l1.size());
		
	}

}
