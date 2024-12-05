package assignments;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class P1e {

	public static void main(String[] args) throws IOException {
		Scanner sc= new Scanner(System.in);
		FileWriter fw;
		int start,end;
		start=sc.nextInt();
		end=sc.nextInt();
		for(int i=start;i<end+1;i++) {
			String f1=i+".txt";
			fw=new FileWriter(f1);
			for(int j=1;j<11;j++) {
				fw.write(i+"*"+j+"="+i*j);
				fw.write("\n");
			}
			fw.write("\n");
			fw.close();
		}
	}

}
