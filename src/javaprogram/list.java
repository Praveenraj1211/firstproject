package javaprogram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class list {
	public static void main(String[] args) {
		List<String> arrlist = new ArrayList<String>();
		arrlist.add("red");
		arrlist.add("blue");
		arrlist.add("black");
		arrlist.add("white");
		System.out.println("colours"+" "+arrlist);
		Collections.addAll(arrlist,"gray", "yellow");
		Collections.sort(arrlist);
		System.out.println(arrlist);
		
	}

}
