package hackerRank;

import java.util.ArrayList;
import java.util.List;

public class GradingStudents {
    public static void main(String[] args) {
        List<Integer> grades = new ArrayList<>();

        grades.add(4);
        grades.add(73);
        grades.add(67);
        grades.add(38);
        grades.add(33);

        System.out.println(gradingStudents(grades));
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
        for (int i = 0; i < grades.size(); i++) {

            int grade = grades.get(i);

            if (grade >= 38) {
                int nextMultiple = ((grade / 5) + 1) * 5;

                if (nextMultiple - grade < 3) {
                    grades.set(i, nextMultiple);
                }
            }
        }

        return grades;
    }
}
