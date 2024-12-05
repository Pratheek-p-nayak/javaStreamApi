package assignments;

import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start,end;
		start=sc.nextInt();
		end=sc.nextInt();
		for(int i=start;i<end+1;i++) {
			for(int j=1;j<11;j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
		}
	}

}
