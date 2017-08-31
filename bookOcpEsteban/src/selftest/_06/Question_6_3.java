package selftest._06;

import java.util.ArrayList;
import java.util.List;

public class Question_6_3 {

	public static void main(String[] args) {

		List<?> l1 = new ArrayList<>();
		List<String> l2 = new ArrayList();
		//List<? super Object> l3 = new ArrayList<String>();
		List<? extends Object> l4 = new ArrayList<String>();
		
	}

}
