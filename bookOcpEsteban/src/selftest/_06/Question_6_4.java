package selftest._06;

import java.util.ArrayList;
import java.util.List;

public class Question_6_4 {

	public static void main(String[] args) {

		List<? super Number> list = new ArrayList<Object>();
		
		list.add(new Integer(2));
		//list.add(new Object());
	}

}
