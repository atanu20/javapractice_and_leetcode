import java.util.Scanner;

public class HcfLcm {
    public static int hcf(int a, int b) {
        if (a == 0) {
            return b;
        }
        if (b == 0) {
            return a;
        }

        if (a > b) {
            return hcf(a - b, b);
        }

        return hcf(a, b - a);
    }

    public static void main(String[] args) {
        int a, b, h, l;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the Two Numbers: ");
        a = s.nextInt();
        b = s.nextInt();
        h = hcf(a, b);
        l = (a * b) / h;

        System.out.println("gcd/hcf is " + h + " lcm is " + l);

    }
}
