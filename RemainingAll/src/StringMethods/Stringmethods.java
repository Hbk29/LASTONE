package StringMethods;

public class Stringmethods {

	public static void main(String[] args) {
	
		String a="abcde";
		
		//length of string====int
		int b=a.length();
		System.out.println(b);
		
		//2.chatAt()====char
		
		System.out.println(a.charAt(3));
		
		//3. tolowercase()====string
		String c="umEsH";
		
		System.out.println(c.toLowerCase());
		
		//4.to uppercase()
		String e=c.toUpperCase();
		System.out.println(e);
		
		
		//5.equal()====true/false
		System.out.println(c.equals("umesh"));
		
		//6.equalignorecase====true/false(ignore upper-lowercase)
		System.out.println(c.equalsIgnoreCase("umesh"));
		System.out.println(c.equalsIgnoreCase("e"));
		

	}

}
