import java.util.Scanner;

public class HoursMinutesSeconds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int h = scan.nextInt();
        int m = scan.nextInt();
        int s = scan.nextInt();

        h = 3600 * h;
        m = 60 * m;

        int h1 = scan.nextInt();
        int m1 = scan.nextInt();
        int s1 = scan.nextInt();

        h1 = 3600 * h1;
        m1 = 60 * m1;

       int hSec = h1 - h;
       int mSec = m1 - m;
       int sSec = s1 - s;

       int sumSec = hSec + mSec + sSec;

        System.out.println(sumSec);

    }
}
