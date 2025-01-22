package pkg1;
public class T3 {
	public static void main(String[] args) {
		String s1="ABC";
		int n=s1.length();
		int x=0;
		String[] arr1=s1.split("");
		String[] output=new String[(int)Math.pow(2, n)-1];
		for(int i=0;i<3;i++) {
			output[x++]=arr1[i];	
		}
		for(int i=0;i<3;i++) {
			output[x++]=arr1[i]+arr1[(i+1)%3];
		}
		output[x]=arr1[0]+arr1[1]+arr1[2];
		for(String i:output) {
			System.out.println(i);
		}
	}
		
}
