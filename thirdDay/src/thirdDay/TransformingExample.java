package thirdDay;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TransformingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> names = Arrays.asList("Alice", "Bob", "Vedika");
		
		List<String> upperCaseNames = names.stream()
				.map(String::toUpperCase)
				.collect(Collectors.toList());
		
		System.out.println("UpperCase names: " + upperCaseNames);
	}

}
