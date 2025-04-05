package Practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Map {

	public static void main(String[] args) {
		java.util.Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "kim");
		map.put(2, "lee");
//		map.put("003", "choi");
		
//		map.put("001", "kang");
		
		System.out.println(map.size());
		
//		System.out.println(map.get("001"));
//		System.out.println(map.get("002"));
//		System.out.println(map.get("003"));
		Set<Integer> keys = map.keySet();
		
		Iterator<Integer> it =keys.iterator();
		while(it.hasNext()) {
			Integer key = it.next();
			String v= map.get(key);
			System.out.println(key +":"+ v);
		}
		
		

	}

}
