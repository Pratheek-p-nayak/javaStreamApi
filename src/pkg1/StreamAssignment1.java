package pkg1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamAssignment1 {
	public static void main(String[] args) {
		List<Integer> num=Arrays.asList(1,4,7,2,8,8,6,5);
//		int num1=num.stream().max(Integer::compare).get();
		int num1=num.stream().distinct().reduce((n,m)->n>m?n:m).get();
		System.out.println("Largest :"+num1);
	}
}
