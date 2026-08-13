// question -> https://www.hackerrank.com/challenges/time-conversion/problem?isFullScreen=true
package hackerRank;

public class TimeConversion {
    public static void main(String[] args) {
        String time = "07:05:45PM";
        System.out.println(timeConversion(time));
    }

    // time conversion function
    static String timeConversion(String time) {
        String period = time.substring(8);
        int hour = Integer.parseInt(time.substring(0, 2));

        if (period.equals("AM")) {
            if (hour == 12) {
                hour = 0;
            }
        } else {
            if (hour != 12) {
                hour += 12;
            }
        }

        return String.format("%02d%s", hour, time.substring(2, 8));
    }
}
