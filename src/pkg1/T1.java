package pkg1;

import java.util.Arrays;

public class T1 {

	public static void main(String[] args) {
		int[] arr1= {1,2,-1,3,-2,-3};
		long count=Arrays.stream(arr1).map(n->Math.abs(n)).distinct().count();
	for(int k=0;k<arr1.length-1;k++) {
		int temp=arr1[k];
		int pos;
		int temp1;
		for(int j=0;j<arr1.length-k;j++) {
			if(temp==Math.abs(arr1[j])) {
				pos=k+1;
				temp1=arr1[j];
				int pos1=j;
				for(int i=arr1.length-1;i>pos1;i--) {
					arr1[i]=arr1[i-1];
				}
				System.out.println(pos);
				arr1[pos]=temp1;
				k++;
			}
		}
	}
	System.out.println(Arrays.toString(arr1));
	}
}
