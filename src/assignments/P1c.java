package assignments;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class P1c {

	public static void main(String[] args) {
		File f1=new File("in.txt");
		Scanner sc;
		try {
			sc = new Scanner(f1);
			int start,end;
			start=sc.nextInt();
			end=sc.nextInt();
			for(int i=start;i<end+1;i++) {
				for(int j=1;j<11;j++) {
					System.out.println(i+"*"+j+"="+i*j);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
