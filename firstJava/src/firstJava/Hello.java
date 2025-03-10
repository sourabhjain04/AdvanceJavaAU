package firstJava;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello this is java");
		 boolean a = false;
		 boolean b = true;
		 System.out.println("a="+ a);
		 
		 System.out.println("b="+ b);

		byte a1=10;  //-128to127
		byte b1=-20;
		System.out.println("a1=: "+ a1);
		System.out.println("b1=: "+ b1);
		
		short a2 =32767;  //-32768 to 32767
		short b2=-5000;
		
	System.out.println("a2 : "+a2);
	System.out.println("b2 : "+b2);
	
	// Int  -2,147,483,648 to 2,147,483,647
	
	//Long -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
	
	
	// float 32-bit IEEE 754
	
	//64-bit IEEE 754 
	
	
	char c = 'A';
	
	String s = "Hello";
	
	s.concat(" World");
	
	System.out.println(s);
	
	StringBuilder sb = new StringBuilder("Hello");
	
	sb.append(",World");
	System.out.println(sb.toString());
	
	
		

	}

}
