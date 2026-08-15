// https://hackerrank-challenge-pdfs.s3.amazonaws.com/35155-the-birthday-bar-English?response-content-disposition=inline%3B%20filename%3Dthe-birthday-bar-English.pdf&response-content-type=application%2Fpdf&X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAR6O7GJNX2PJLRWX4%2F20260815%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20260815T105002Z&X-Amz-Expires=3600&X-Amz-SignedHeaders=host&X-Amz-Signature=ef6607ba5eff0cfebafc78570bd67c691415165a220aa7d02978b5ff07bc1c9a

package hackerRank;

import java.util.ArrayList;
import java.util.List;

public class SubArrayDivisor {
    public static void main(String[] args) {
        List<Integer> s = new ArrayList<>();
        s.add(1);
        s.add(2);
        s.add(1);
        s.add(3);
        s.add(2);

        int d = 3;
        int m = 2;

        System.out.println(birthday(s, d, m));
    }

    static int birthday(List<Integer> s, int d, int m) {
        int count = 0;

        for (int i = 0; i <= s.size() - m; i++) {
            int sum = 0;

            for (int j = i; j < i + m; j++) {
                sum += s.get(j);
            }

            if (sum == d) {
                count++;
            }
        }

        return count;
    }

}
