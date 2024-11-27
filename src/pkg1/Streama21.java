package pkg1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Streama21 {

	public static void main(String[] args) {
		 List<Integer> numbers = Arrays.asList(34, 78, 12, 90, 56, 78, 90);
	        Optional<Integer> secondLargest = numbers.stream()
	            .distinct()
	            .sorted(Comparator.reverseOrder())
	            .skip(1)
	            .findFirst();
	        if (secondLargest.isPresent()) {
	            System.out.println("The second largest number is: " + secondLargest.get());
	        }
	}
}
