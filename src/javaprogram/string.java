package javaprogram;

public class string {
	public static void main(String[] args) {
		String a ="PRAVEENRAJ";
		String b ="goodmorning";
		int length = a.length();
		boolean equal = b.equals(a);
		boolean equalignor = a.equalsIgnoreCase(b);
		String c = b.toUpperCase();
		String d = a.toLowerCase();
		boolean e = a.startsWith(a);
		boolean f = b.endsWith(b);
		boolean g = b.contains(b);
		String w = "java";
		String h = a.replace(a, w);
		String i = a.substring(2);
		int j = a.compareTo(b);
		String join = a.concat(b);
		
		
		System.out.println(length);
		System.out.println("string b is equal to string a"+ " "+equal); 
		System.out.println(equalignor);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);
		System.out.println(j);
		System.out.println(join);
	
	for(int z=a.length()-1;z>=0;z--)
	{
		System.out.print(a.charAt(z));
	}

	
	}
}
