package collections;

import java.util.*;

public class HashMapEx9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1, "Red");
		hm.put(2,"Blue");
		hm.put(3,"Black");
		System.out.println(hm);
		Set set = hm.entrySet();
		System.out.println("Set view of hashmap : "+set );
		

	}

}
