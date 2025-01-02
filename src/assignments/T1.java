package assignments;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T1 {
	static List<String> getHolidays(String temp){
		List<String> s1=new ArrayList<>();
		String day = "";
		String month="";
		String holiday="";
		String[] temp1;
		String[] temp2;
		temp1=temp.split(" ");
		temp2=temp1[0].split("-");
		day=temp2[0];
		month=temp2[1];
		holiday=temp1[1].replace('_', ' ');
		s1.add(day);
		s1.add(month);
		s1.add(holiday);
		return s1;
	}
	public static void main(String[] args) throws IOException {
		File f1= new File("Holidays.txt");
		Scanner sc1=new Scanner(f1);
		DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("EEE  d  MMM");
		int year=2025;
		int month = 0;
		int day = 0;
		int count=0;
		String temp="";
		String holiday1="";
		String holiday2="";
		String holidays="";
		String token="";
		List<String> s1=new ArrayList<>();
		if(sc1.hasNext()) {
			temp=sc1.nextLine();
			s1=getHolidays(temp);
			day=Integer.parseInt(s1.get(0));
			month=Integer.parseInt(s1.get(1));
			holiday2=s1.get(2);
		}
		for(int i=1;i<=12;i++) {
			LocalDate dt1 = LocalDate.of(year, i, 1);
			for(int j=1;j<=dt1.lengthOfMonth();j++) {
				dt1=LocalDate.of(year, i, j);
				if(dt1.getDayOfWeek().getValue()==7) {
					holiday1="Weekly Holiday";
					token="-";
					holidays=holiday1;
				}
				if(day==j&&month==i) {
					token="-";
					count++;
					if(holidays.isEmpty()) {
						holidays=holiday2;
					}
					else {
						holidays+=", "+holiday2;
					}
					if(sc1.hasNext()) {
						temp=sc1.nextLine();
						s1=getHolidays(temp);
						day=Integer.parseInt(s1.get(0));
						month=Integer.parseInt(s1.get(1));
						holiday2=s1.get(2);
					}
				}
				System.out.println(dt1.format(dtf1)+" "+token+" "+holidays);
//				System.out.println(holiday2);
				holiday1="";
				holidays="";
				token="";
				count=0;
			}
			System.out.println();
		}
	}

}
