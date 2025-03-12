package thirdDay;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilteringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Integer> numbers = Arrays.asList(10,15 ,20,25, 30,40,50);

		List<Integer> evenNumbers =numbers.stream()
				.filter(n->n%2 ==0)
				
				.collect(Collectors.toList());
		
		System.out.println("Even number : "+ evenNumbers);
	}

}
