package Practice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class set2 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("유니");
		set.add("코드");
		set.add("순");
		
		Iterator<String> it = set.iterator();
		
		System.out.println(set.size());
		
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}

	}

}
