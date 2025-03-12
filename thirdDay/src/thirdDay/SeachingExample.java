package thirdDay;

import java.util.Arrays;
import java.util.List;

public class SeachingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> names = Arrays.asList("Alice","Bob","Charlie","Vedika li");
		
		System.out.println("Contains ? "+ names.contains("li"));
		System.out.println("Index of Charlie: "+ names.indexOf("Charlie"));
	}

}
