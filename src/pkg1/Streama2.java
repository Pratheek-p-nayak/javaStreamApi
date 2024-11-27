package pkg1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Streama2 {
	public static void main(String[] args) {
		List<Integer> list1=new ArrayList<>();
		list1.add(8);
		list1.add(7);
		list1.add(4);
		list1.add(1);
		list1.add(6);
		list1.add(8);
//		Collections.sort(list1, Comparator.reverseOrder());
//		System.out.println(list1.get(1));
//		int n=list1.size();
//		System.out.println(n);
		 List<Integer> numbers = new ArrayList<>(list1);
		 Collections.sort(numbers, Collections.reverseOrder());
         int firstLargest = numbers.get(0);
         Integer secondLargest = null;
         for (Integer num : numbers) {
        	 if (num != firstLargest) {
                secondLargest = num;
                break;
             }
         }
         if (secondLargest != null) {
            System.out.println("The second largest number is: " + secondLargest);
         } 
	}
}
