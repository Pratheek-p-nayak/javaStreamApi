package assignments;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class T3 {
	public static void main(String[] args) throws IOException {
			LocalDate dt1 = LocalDate.of(2025, 1, 12);
			DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("EEE");
			System.out.println(dt1.getDayOfWeek().getValue()+" "+dt1.format(dtf1));
	}

}
