package assignments;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class P1d {

	public static void main(String[] args) throws IOException {
		File f1=new File("in.txt");
		Scanner sc= new Scanner(f1);
		FileWriter fw=new FileWriter("out.txt");
		int start,end;
		String line1;
		line1=sc.next();
		String arr1[]=line1.split(",");
		start=Integer.parseInt(arr1[0]);
		end=Integer.parseInt(arr1[1]);
		for(int i=start;i<end+1;i++) {
			for(int j=1;j<11;j++) {
				fw.write(i+"*"+j+"="+i*j);
				fw.write("\n");
			}
			fw.write("\n");
		}
		fw.close();
	}

}
