package assignments;

public class P2a1 {

	public static void main(String[] args) {
		int start=9;
		int end=20;
		double hourHandAngle=0;
		double minuteHandAngle=0;
		double angle=90;
		System.out.println("Time \t Angle");
		for(int i=start;i<=end;i++) {
			for(int j=5;j<60;j+=5) {
				hourHandAngle+=2.5;
				minuteHandAngle+=30;
				angle+=minuteHandAngle-hourHandAngle;
				angle=(angle>360-angle)?(360-angle):angle;
				System.out.printf("%02d:%02d \t  %f\n",i,j,angle);
			}
		}
	}

}
