public class Practice {
    static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 400 == 0 || year % 100 != 0);
    }

    public static void main(String[] args) {
        int year = 2004;

        System.out.println(year + ((isLeapYear(year)) ? " is a leap year" :" is not a leap year"));
    }
}
