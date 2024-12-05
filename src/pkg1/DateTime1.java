package pkg1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class DateTime1 {

	public static void main(String[] args) {
		LocalDateTime dt=LocalDateTime.now().minusDays(3);
		LocalDateTime dt1;
		DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		List<String> list1=new ArrayList<>();
		for(int i=1;i<32;i++) {
			dt1=dt.plusDays(i);
			String date1=dtf1.format(dt1);
			list1.add(date1);
		}
		System.out.println(list1);
	}
}
