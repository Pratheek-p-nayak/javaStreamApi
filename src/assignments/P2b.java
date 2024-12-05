package assignments;

public class P2b {

	public static void main(String[] args) {
		// Start time is 9:00 AM
        int startHour = 9;
        int endHour = 20; // 8 PM in 24-hour format

        System.out.println("Time\t\t Angle (°)");

        for (int hour = startHour; hour <= endHour; hour++) {
            for (int minute = 0; minute < 60; minute += 5) {
                double angle = calculateAngle(hour, minute) % 360;
                String formattedTime = convertTo12HourFormat(hour, minute);
                System.out.println(formattedTime+" \t "+ angle);
            }
        }
    }
	 // Method to calculate the angle between hour and minute hands
    private static double calculateAngle(int hour, int minute) {
        hour = hour % 12;

        double hourHandAngle = (hour * 30) + (minute * 0.5);
        double minuteHandAngle = minute * 6;

        double angle = Math.abs(hourHandAngle - minuteHandAngle);

        return Math.min(angle, 360 - angle);
    }

    // Method to convert 24-hour time to 12-hour format with AM/PM
    private static String convertTo12HourFormat(int hour, int minute) {
        String period = (hour < 12) ? "AM" : "PM";
        hour = hour % 12;
        if (hour == 0) {
            hour = 12; // Midnight or Noon
        }
        return String.format("%02d:%02d %s", hour, minute, period);
    }

}

        

   