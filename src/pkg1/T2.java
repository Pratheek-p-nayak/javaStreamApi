package pkg1;

import java.util.Arrays;
import java.util.Scanner;
public class T2 {
	static Scanner sc1=new Scanner(System.in);
	static void insertElement(int n,int[] arr1) {
		for(int i=0;i<n;i++) {
			arr1[i]=sc1.nextInt();
		}
		Arrays.stream(arr1).forEach(System.out::println);
	}
	public static void main(String[] args) {
		int n;
		int[] arr1;
		System.out.println("Enter number of elements: ");
		n=sc1.nextInt();
		arr1= new int[n];
		System.out.println("Enter the Elements: ");
		insertElement(n,arr1);
	}
}
