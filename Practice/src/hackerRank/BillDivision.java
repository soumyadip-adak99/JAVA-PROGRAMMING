// https://hackerrank-challenge-pdfs.s3.amazonaws.com/24060-bon-appetit-English?response-content-disposition=inline%3B%20filename%3Dbon-appetit-English.pdf&response-content-type=application%2Fpdf&X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAR6O7GJNX2PJLRWX4%2F20260815%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20260815T164848Z&X-Amz-Expires=3600&X-Amz-SignedHeaders=host&X-Amz-Signature=10672a06fa85ac5d3641e9b6cba3055ac156e4e1c05ec2873050aa7630813171
package hackerRank;

public class BillDivision {
    public static void main(String[] args) {
        int[] bill = {3, 10, 2, 9};
        int k = 1, b = 12;
        bonAppetit(bill, k, b);
    }

    static void bonAppetit(int[] bill, int k, int b) {
        int sum = 0;

        for (int i = 0; i < bill.length; i++) {
            if (i != k) {
                sum += bill[i];
            }
        }

        int div = sum / 2;
        if (div == b) {
            System.out.println("Bon Appetit");
        } else {
            b -= div;
            System.out.println(b);
        }
    }
}
