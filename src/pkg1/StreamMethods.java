package pkg1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethods {

	public static void main(String[] args) {
		List<Integer> num=Arrays.asList(1,4,7,2,8,7,4);
		List<String> str=Arrays.asList("A","B","C","D");
		List<Double> n=num.stream().map(Integer::doubleValue).collect(Collectors.toList());
//		n.forEach(n1->System.out.println(n1));
//		num.stream().sorted().forEach(System.out::println);
//		num.stream().distinct().forEach(System.out::println);
//		num.stream().peek(System.out::println).forEach(n2->{});;
//		int res=num.stream().findFirst().get();
//		System.out.println(res);
//		System.out.println(num.stream().allMatch(n2->n2%2==0));
//		System.out.println(num.stream().anyMatch(n2->n2%3==0));
		System.out.println(n);
	}

}
