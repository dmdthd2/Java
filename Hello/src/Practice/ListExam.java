package Practice;

import java.util.ArrayList;
import java.util.List;

public class ListExam {

	public static void main(String[] args) {
		List<String> list =new ArrayList<String>();
		list.add("현준병신");
		list.add("공부하는 척");
		list.add("현준병신");
		
		System.out.println(list.size());
		
		for(int i = 0; i<list.size(); i++) {
			String st = list.get(i);
			System.out.println(st);
		}
	}

}
