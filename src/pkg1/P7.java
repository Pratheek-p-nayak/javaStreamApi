package pkg1;

import java.util.Scanner;

abstract class A1{
	public int length;
	public int width;
	public int height;
	public abstract double calcBoxSurface();
	public double square(int n) {
		return n*n;
	}
}
class Box extends A1{
	@Override
	public double calcBoxSurface() {
		var result1= 2*(length+width+height);
		return result1;
	}
	
}
public class P7 {

	public static void main(String[] args) {
		A1 a1=new Box();
		Scanner sc1= new Scanner(System.in);
		var w=sc1.nextInt();
		a1.width=w;
		a1.length=a1.width/2;
		a1.height=2*(a1.width+a1.length);
		var result1=a1.calcBoxSurface();
		System.out.println(result1);
		System.out.println(a1.square(w));
	}

}
