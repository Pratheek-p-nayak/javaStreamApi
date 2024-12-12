package pkg1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P22 {
	static List<String> list1= new ArrayList<>();
	static List<String> list2= new ArrayList<>();
	public static List<String> loadFile(String fName) throws FileNotFoundException{
		File f1=new File(fName);
		List<String> list1= new ArrayList<>();
		Scanner sc2=new Scanner(f1);
		while(sc2.hasNext()) {
			list1.add(sc2.nextLine());
		}
		return list1;
	}
	public static String printIfExists(int num1) {               
		String result1 = "";
		String temp1=String.valueOf(num1);
		int pos1=list2.indexOf(temp1);
		result1=list1.get(pos1);
		return result1;
	}
	public static String printTwentyOneToHundred(int num1) {      
		int part2=num1%10;
		int part1=num1-part2;
		String result1=printIfExists(part1)+" "+printIfExists(part2);	
		return result1;
	}
	public static String printHundredToThousand(int num1) {
		int part3=num1%100;
		int part2=100;
		int part1=num1/100;
		String result1=printIfExists(part1)+" "+printIfExists(part2)+" "+numFiguresToString(part3);
		return result1;
	}
	public static String printThousandToLakh(int num1) {
		int part3=num1%1000;
		int part2=1000;
		int part1=num1/1000;
		String result1=numFiguresToString(part1)+" "+printIfExists(part2)+" "+numFiguresToString(part3);
		return result1;
	}
	public static String printLakhToCrore(int num1) {
		int part3=num1%100000;
		int part2=100000;
		int part1=num1/100000;
		String result1=numFiguresToString(part1)+" "+printIfExists(part2)+" "+numFiguresToString(part3);
		return result1;
	}
	public static String printAboveCrore(int num1) {
		int part3=num1%10000000;
		int part2=10000000;
		int part1=num1/10000000;
		String result1=numFiguresToString(part1)+" "+printIfExists(part2)+" "+numFiguresToString(part3);
		return result1;
	}

	public static String numFiguresToString(int num1) {
		String temp1=String.valueOf(num1);
		String result1="";
		if(list2.contains(temp1)) {
			result1=printIfExists(num1);	
		}
		else if(num1>20&&num1<=100) {
			result1=printTwentyOneToHundred(num1);
		}
		else if(num1>100&&num1<=1000) {
			result1=printHundredToThousand(num1);
		}
		else if(num1>1000&&num1<=100000) {
			result1=printThousandToLakh(num1);
		}
		else if(num1>100000&&num1<=10000000) {
			result1=printLakhToCrore(num1);
		}
		else {
			result1=printAboveCrore(num1);
		}
		return result1;
	}
	public static void main(String[] args) throws FileNotFoundException {
		int num1;
		list1=loadFile("english_numbers1.txt");
		list2=loadFile("numerics1.txt");
		Scanner sc1=new Scanner(System.in);
		num1=sc1.nextInt();
		String result1="";
		result1=numFiguresToString(num1);
		System.out.println(result1);
	}

}
