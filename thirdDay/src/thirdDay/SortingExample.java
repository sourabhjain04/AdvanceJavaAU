package thirdDay;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numbers = Arrays.asList(5,2,9,1,7);
		
		System.out.println("before Sorting :"+numbers);
		
		Collections.sort(numbers);
		System.out.println("After Sorting : "+numbers);
	}

}
