package Practice;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class setExam {

	public static void main(String[] args) {
		Set<String> s = new TreeSet<>(Comparator.reverseOrder());
		
		s.add("뉴뉴");
		s.add("유");
		s.add("유");
		s.add("아낭이");
		s.add("안녕");
		
		Iterator<String> it = s.iterator();
		
		while(it.hasNext()) {
			String st = it.next();
			System.out.println(st);
			
			
		}

	}

}
