package javaprogram;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class map {
	public static void main(String[] args) {
		Map<String,Integer> a = new HashMap<String,Integer>();
		a.put("praveen", 50);
		a.put("ravi", 60);
		//System.out.println(a);
//		Set<Entry<String, Integer>> v = a.entrySet();
//		for(Entry<String, Integer> c:v) {
//			System.out.println(c);
		
	for(Entry<String, Integer> b : a.entrySet()) {
		
			System.out.println(b.getKey()+" : "+b.getValue());
			
			
		}
			
	}
	

}
