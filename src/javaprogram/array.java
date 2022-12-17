package javaprogram;

import java.util.Arrays;

public class array {
	
	    public static void main(String[] args) {
	        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	        int index = 3;
	        int newValue = 100;
	        for (int i = 0; i < array.length; i++) {
	            if (i == index) {
	                array[i] = newValue;
	            }
	        }
	        System.out.println(Arrays.toString(array));
	    }
	}

