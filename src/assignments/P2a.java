package assignments;

public class P2a {
	public static void main(String[] args) {
	        // Start time is 9:00 AM
	        int startHour = 9;
	        int endHour = 20; // 8 PM in 24-hour format
	        
	        System.out.println("Time \t Angle (°)");   
	        for (int hour = startHour; hour <= endHour; hour++) {
	            for (int minute = 0; minute < 60; minute += 5) {
	                double angle = calculateAngle(hour, minute);
	                System.out.printf("%02d:%02d     %-10.2f%n", hour, minute, angle);
	            }
	        }
	    }

	    // Method to calculate the angle between hour and minute hands
	    private static double calculateAngle(int hour, int minute) {
	        hour = hour % 12;

	        // Calculate positions of the hour and minute hands
	        double hourHandAngle = (hour * 30) + (minute * 0.5); // 30° per hour, 0.5° per minute
	        double minuteHandAngle = minute * 6; // 6° per minute

	        // Calculate the absolute difference between the two angles
	        double angle = Math.abs(hourHandAngle - minuteHandAngle);
	        double res=Math.min(angle,(360-angle));
	        // Return the smaller angle
	        return res;
	}
}
