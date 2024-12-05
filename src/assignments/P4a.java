package assignments;

import java.util.ArrayList;
import java.util.List;

public class P4a {

	public static void main(String[] args) {
		int count=100;
		List<String> list1= new ArrayList<>();
		List<Integer> lucky= new ArrayList<>();
		List<Integer> unlucky= new ArrayList<>();
		for(int i=0;i<count;i++) {
			list1.add("C");
		}
		System.out.println(list1);
		for(int i=0;i<count;i++) {
			list1.set(i, "O");
		}
		System.out.println(list1);
		for(int i=1;i<count;i+=2) {
			list1.set(i, "C");
		}
		System.out.println(list1);
		for(int j=2;j<count;j++) {
			for(int i=j;i<count;i+=(j+1)) {
				if(list1.get(i).equals("C")) {
					list1.set(i, "O");
				}
				else {
					list1.set(i, "C");
				}
			}	
			System.out.println(list1);
		}
		for(int i=0;i<count;i++) {
			if(list1.get(i).equals("O")) {
				lucky.add(i+1);
			}
			else {
				unlucky.add(i+1);
			}
		}
		System.out.println(lucky +"are lucky prisoners being released today");
		System.out.println(unlucky +"are unlucky prisoners being released after 4 weeks");

	}

}
