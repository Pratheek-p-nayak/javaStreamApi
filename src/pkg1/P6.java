package pkg1;

import java.util.Scanner;

abstract class Shape{
	public int length;
	public int width;
	public int height;
	abstract void calculateSurface();
}
class BoxSurface extends Shape{

	@Override
	void calculateSurface() {
		double boxSurface=2*(length+width+height);
		System.out.println(boxSurface);
	}
	
}
public class P6 {

	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		int w=sc1.nextInt();
		Shape shape1=new BoxSurface();
		shape1.width=w;
		shape1.length=shape1.width/2;
		shape1.height=2*(shape1.length+shape1.width);
		shape1.calculateSurface();
	}

}
