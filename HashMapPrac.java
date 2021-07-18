import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "Nitin");
		map.put(2, "Sayani");
		
		
		//chanign it to entryset , so that we can traverse
		Set set = map.entrySet();
		Iterator it = set.iterator();
		while(it.hasNext())
		{
			//converting to Map.Entry so that we can get key and values
			Map.Entry entry = (Entry) it.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		for(Map.Entry entry:map.entrySet())
		{
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		

	}

}
