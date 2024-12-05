package assignments;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class P1f {

	public static void main(String[] args) throws IOException {
		Scanner sc= new Scanner(System.in);
		LocalDateTime dt=LocalDateTime.now();
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyymmdd_hhmmss");
		String dir="TABLES/";
		File f1=new File(dir);
		f1.mkdir();
		FileWriter fw = null;
		int start,end;
		start=sc.nextInt();
		end=sc.nextInt();
		for(int i=start;i<end+1;i++) {
			String fn=i+"_"+dtf.format(dt)+".txt";
			fw=new FileWriter(dir+fn);
			for(int j=1;j<11;j++) {
				fw.write(i+"*"+j+"="+i*j);
				fw.write("\n");
			}
			fw.write("\n");
			fw.close();
		}
	}

}
