package pkg1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods2 {
	public static void main(String[] args) {
		int[] arr1= {67,45,31,89,94,12};
		List<Integer> list1=new ArrayList<>();
		list1.add(77);
		list1.add(42);
		list1.add(82);
		list1.add(7);
		list1.add(15);
//		Collections.sort(list1);
//		list1.add(10);
		List<Integer>sort1=list1.stream().sorted().collect(Collectors.toList());
		List<Integer> sort2=Arrays.stream(arr1).sorted().boxed().collect(Collectors.toList());
		System.out.println(sort2);
		int num1=Arrays.stream(arr1).sorted().boxed().findFirst().orElseThrow(()->new NullPointerException());
		System.out.println(num1);
		int num2=Arrays.stream(arr1).sorted().sum();
		System.out.println(num2);
	}

}
