package assignments;

public class P2a1 {

	public static void main(String[] args) {
		int start=9;
		int end=20;
		double hourHandAngle=2.5;
		double minuteHandAngle=30;
		double angle=90;
		double res=0;
		System.out.println("Time \t Angle");
		for(int i=start;i<=end;i++) {
			for(int j=0;j<60;j+=5) {
				if(i==9&&j==0) {
					continue;
				}
				angle+=minuteHandAngle-hourHandAngle;
				res=Math.min(360-angle,angle);
				System.out.printf("%02d:%02d \t  %.2f\n",i,j,res);
			}
		}
	}

}
