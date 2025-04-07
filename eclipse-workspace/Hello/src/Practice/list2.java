package Practice;

import java.util.ArrayList;
import java.util.List;

public class list2 {

	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		l.add("안냥");
		l.add("안냥");
		l.add("안냐앙");
		
		for(int i = 0; i<l.size(); i++) {
			String st = l.get(i);
			System.out.println(st);
		}

	}

}
