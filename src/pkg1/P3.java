package pkg1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P3 {

	public static void main(String[] args) throws FileNotFoundException {
		File f1=new File("dictionary.txt");
		Scanner sc1=new Scanner(f1);
		Random rand1=new Random();
		List<String> dict1=new ArrayList<>();
		Scanner sc2=new Scanner(System.in);
		String compChoice1="";
		String usrChoice1="";
		String sysLastChar1="";
		String usrFirstChar1="";
		int pos1;
		int len1=0;
		int len2=0;
		while(sc1.hasNext()) {
			String temp=sc1.nextLine();
			dict1.add(temp);
		}
		pos1=rand1.nextInt(dict1.size());
		compChoice1=dict1.get(pos1);
		System.out.println("Computer: "+compChoice1);
		dict1.remove(compChoice1);
		len1=compChoice1.length();
		sysLastChar1=compChoice1.substring(len1-1,len1);
		while(true) {
			System.out.print("User: ");
			usrChoice1=sc2.nextLine().toLowerCase();
			usrFirstChar1=usrChoice1.substring(0,1);
			if(dict1.contains(usrChoice1)&&usrFirstChar1.equals(sysLastChar1)) {
				dict1.remove(usrChoice1);
				len2=usrChoice1.length();
				String usrLastChar1=usrChoice1.substring(len2-1,len2);
				List<String> temp1=dict1.stream().filter(word->word.startsWith(usrLastChar1)).collect(Collectors.toList());
				pos1=rand1.nextInt(temp1.size());
				compChoice1=temp1.get(pos1);
				dict1.remove(compChoice1);
				System.out.println("Computer: "+compChoice1);
				len1=compChoice1.length();
				sysLastChar1=compChoice1.substring(len1-1,len1);        //thread.sleep() user and computer marks
			}
			else {
				System.out.println("Computer Wins");
				break;
			}
		}
	}
}
