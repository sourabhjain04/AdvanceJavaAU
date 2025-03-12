package genericsAll;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestGenerics2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Map<Integer,String> map = new HashMap<Integer, String>();
		map.put(1, "Vijay");
		map.put(4, "Umesh");
		map.put(2, "Ankit");
		
		Set<Map.Entry<Integer,String>> set = map.entrySet();
		
		Iterator<Map.Entry<Integer,String> > itr = set.iterator();
		while(itr.hasNext()) {
			Map.Entry e = itr.next();
			System.out.println(e.getKey()+" "+e.getValue());
			
		}
	
	
	}

}
