public class Calendar {

    public static String weekChart(int remainder) {
        return switch (remainder) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid Day";
        };
    }

    public static int monthChart(int month) {
        if (month <= 12) {
            if (month == 1 || month == 10) {
                return 0;
            } else if (month == 2 || month == 3 || month == 11 || month == 12) {
                return 3;
            } else if (month == 4 || month == 7) {
                return 6;
            } else if (month == 5) {
                return 1;
            } else if (month == 6) {
                return 4;
            } else if (month == 8) {
                return 2;
            } else {
                return 5;
            }
        } else {
            return 0;
        }
    }

    public static int centuryChart(int year) {

        int century = year / 100;
        int remainder = century % 4;

        return switch (remainder) {
            case 0 -> 6; // Centuries like 2000, 1600, 2400
            case 1 -> 4; // Centuries like 2100, 1700, 2500
            case 2 -> 2; // Centuries like 2200, 1800, 2600
            case 3 -> 0; // Centuries like 2300, 1900, 2700
            default -> 0;
        };

        /*
        if (year >= 2300 && year <= 2399 || year >= 1900 && year <= 1999 || year >= 1500 && year <= 1599) {
            return 0;
        } else if (year >= 2200 && year <= 2299 || year >= 1800 && year <= 1899 || year >= 1400 && year <= 1499) {
            return 2;
        } else if (year >= 2100 && year <= 2199 || year >= 1700 && year <= 1799) {
            return 4;
        } else if (year >= 2000 && year <= 2099 || year >= 1600 && year <= 1699) {
            return 6;
        } else {
            return Integer.MIN_VALUE;
        } */
    }

    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && (year % 400 == 0 || year % 100 != 0);
    }

    public static void getWeekDay(int day, int month, int year) {
        if (year <= 1400) {
            System.out.println("The result may be incorrect");
        }

        int value, lastTowDigits = year % 100;
        int cosent = lastTowDigits / 4;

        if (isLeapYear(year)) {
            value = (day + monthChart(month) + centuryChart(year) + lastTowDigits + cosent - 1) % 7;
            System.out.println(weekChart(value));

        } else {
            value = (day + monthChart(month) + centuryChart(year) + lastTowDigits + cosent) % 7;
            System.out.println(weekChart(value));
        }
    }

    public static void main(String[] args) {
        int day = 11;
        int month = 8;
        int year = 2031;
        getWeekDay(day, month, year);
    }
}
