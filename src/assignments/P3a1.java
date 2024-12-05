package assignments;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P3a1 {
	public static List<String> getUnitAndValue(String x){
		String x1="";
		String x2="";
		List<String> l1=new ArrayList<>();
		for(int i=0;i<x.length();i++) {
			if(Character.isDigit(x.charAt(i))) {
				x1+=x.charAt(i);
			}
			else {
				x2+=x.charAt(i);
			}
		}
		l1.add(x1);
		l1.add(x2);
		return l1;
	}
	public static void main(String[] args) throws IOException {
		double unit1=0;
		double unit2=0;
		String unitMes1;
		String unitMes2;
		String s1;
		String s2;
		String a1[];
		List<String> temp=new ArrayList<>();
		File f1=new File("inConvert.txt");
		FileWriter fw=new FileWriter("outConvert.txt");
		Scanner sc=new Scanner(f1);

		while(sc.hasNext()) {
			String line=sc.nextLine();
			a1=line.split("=");
			s1=a1[0];
			s2=a1[1];
			temp=getUnitAndValue(s1);
			unit1=Integer.parseInt(temp.get(0));
			unitMes1=temp.get(1).trim();
			temp=getUnitAndValue(s2);
			unit2=Integer.parseInt(temp.get(0));
			unitMes2=temp.get(1).trim();
			unit1=unit2/unit1;
			fw.write("1"+unitMes1+"="+unit1+unitMes2+"\n");
			unit2=1/unit1;
			fw.write("1"+unitMes2+"="+unit2+unitMes1+"\n");
		}
		System.out.println("Output successfully written to outConvert.txt");
		fw.close();
	}
}
