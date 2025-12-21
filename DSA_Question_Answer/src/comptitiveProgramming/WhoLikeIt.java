package comptitiveProgramming;

public class WhoLikeIt {
    public static void main(String[] args) {
        System.out.println(whoLikesIt(new String[] {}));
        System.out.println(whoLikesIt(new String[] { "Jacob", "Alex" }));
        System.out.println(whoLikesIt(new String[] { "Max", "John", "Mark" }));
        System.out.println(whoLikesIt(new String[] { "Max", "John", "Mark", "Alex" }));
    }

    /*
     * @param String... names it looks like String[] names
     */
    public static String whoLikesIt(String... names) {
        int persons = names.length;

        if (persons == 0)
            return "no one likes this".trim();
        else if (persons == 1)
            return names[0] + " likes this".trim();
        else if (persons == 2)
            return names[0] + " and " + names[1] + " like this".trim();
        else if (persons == 3)
            return names[0] + ", " + names[1] + " and " + names[2] + " like this".trim();
        else
            return names[0] + ", " + names[1] + " and " + (persons - 2) + " other likes this".trim();

    }
}
