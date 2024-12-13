package pkg1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P2 {
	
	static List<String> list1=new ArrayList<>();
	static List<Integer> list2=new ArrayList<>();
	static String result1="";
	public static List<String> loadFile1(String fName) throws FileNotFoundException{
		File f1=new File(fName);
		Scanner sc2=new Scanner(f1);
		while(sc2.hasNext()) {
			list1.add(sc2.nextLine());
		}
		return list1;
	}
	public static List<Integer> loadFile2(String fName) throws FileNotFoundException{
		File f1=new File(fName);
		Scanner sc2=new Scanner(f1);
		while(sc2.hasNext()) {
			list2.add(sc2.nextInt());
		}
		return list2;
	}
	public static String ifExists(int num1) {
		int pos1;
		pos1=list2.indexOf(num1);
		result1=list1.get(pos1);
		return result1;
	}
	public static String printTwentyToHundred(int num1) {
		int part2=num1%10;
		int part1=num1-part2;
		result1=ifExists(part1)+" "+ifExists(part2);
		return result1;
	}
	public static String printHundredToThousand(int num1) {
		int part2=num1%100;//21
		int part1=num1-part2;
		int part3=part2%10;
		part2=part2-part3;
		result1=ifExists(part1)+" and "+ifExists(part2)+" "+ifExists(part3);
		return result1;
	}
	
	public static void main(String[] args) throws FileNotFoundException{
		loadFile1("english_numbers.txt");
		loadFile2("numerics.txt");
		Scanner sc1= new Scanner(System.in);
		int num1=sc1.nextInt();
		if(list2.contains(num1)) {
			result1=ifExists(num1);
		}
		else {
			if(num1>20&&num1<100) {
				result1=printTwentyToHundred(num1);
			}
			else if(num1>100&&num1<1000) {
				result1=printHundredToThousand(num1);
			}
			else if(num1>1000&&num1<100000) {
				int part1=num1/1000;//2101 2
				int part2=part1*1000;//2 2000
				int part3=num1%1000;//2101 101
				int part4=part3%100;//101 1
//				part3=
			}
		}
		System.out.println(result1);
	}

}
