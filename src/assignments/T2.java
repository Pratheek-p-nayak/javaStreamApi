package assignments;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class T2 {
	public static void main(String[] args) throws IOException {
		String old1="How are you ? Oh my god you are bleeding! Let us go to the doctor quickly";
		String new1;
		for(int i=0;i<old1.length();i++) {
			if(!Character.isLetterOrDigit(old1.charAt(i))&&!Character.isWhitespace(old1.charAt(i))) {
				old1=old1.replace(String.valueOf(old1.charAt(i)), "");
			}
		}
		new1=old1;
		System.out.println(new1);
	}

}
