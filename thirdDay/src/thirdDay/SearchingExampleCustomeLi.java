package thirdDay;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SearchingExampleCustomeLi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> names = Arrays.asList("Alice","Bob","Charlie","Liam","Olivia");
		
		List<String>  result = names.stream()
				.filter(name-> name.toLowerCase().contains("li"))
				.collect(Collectors.toList());
		
		System.out.println("Names Containing li: "+ result);
				}

}
