package basic.ex.collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		Set set = new HashSet();
		
		set.add("Hello");
		set.add(new Integer(187));
		set.add(new Float(4.56F));
		set.add("Hello");
		set.add(new Integer(187));
		set.add(new MyStudent());
		
		Object [] obj = set.toArray();
		
		for(int i = 0; i<set.size();i++) {
			System.out.println(obj[i]);
		}
		
		System.out.println(set);
	}

}
