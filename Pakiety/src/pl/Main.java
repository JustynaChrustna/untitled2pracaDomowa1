package pl;

import pl.com.connectis.cschool2.Hello;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hello h=new Hello(5, "hello",2.0);
		System.out.println(h.str);
		System.out.println(h.i);
		System.out.println(h.d);
		
		
		
		HelloPl h2 =new HelloPl("str1", "str2", "str3");
	}

}
