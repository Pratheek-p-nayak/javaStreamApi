package pkg1;

public class P8 {

	public static int func1(int n) {
		if(n==1)
			return 1;
		return func1(n-1);
	}
	public static void main(String[] args) {
		int n=func1(5);
		System.out.println(n);
	}

}
