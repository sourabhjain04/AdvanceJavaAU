package thirdDay;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamFindFirstExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numbers = Arrays.asList(10,20,30,40,50);
		
		Optional<Integer> result =numbers.stream()
				.filter(n -> n>25)
				.findFirst();
		
		result.ifPresent(System.out::println);
		
		
		
	}

}
