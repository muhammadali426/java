package javacore;

public class StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a ="hello/world";//string literal
		String b = a;
		String ab = new String("hello");// with string class
		
		System.out.println(a.charAt(3));
		System.out.println(a.indexOf("e"));
		System.out.println(a.substring(1, 5));
		
		System.out.println(a.substring(3));
		System.out.println(a.concat(" Bhai"));
		System.out.println(a.trim());
		System.out.println(a.toUpperCase());
		String arr[] =a.split("/");
		
		System.out.println(arr[0]);
		
		System.out.println(arr[1]);
		
		System.out.println(a.replace("/", "$"));
		
	}

}
