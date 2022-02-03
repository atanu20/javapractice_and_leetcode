
// Write a program to count the number of 1’s in a binary representation of the number.
public class NumofDigitInBinary {
    public static void main(String[] args) {
        int a = 11;
        int one = 0;
        System.out.println(Integer.toBinaryString(a));
        while (a > 0) {

            a &= (a - 1); // Brian Kernighan’s Algorithm
            one++;
        }
        System.out.println("1's count " + one);

        a = 11;
        int cou1 = 0, cou0 = 0;

        while (a > 0) {
            if ((a & 1) > 0) {
                cou1++;
            } else {
                cou0++;
            }
            a = a >> 1;
        }
        System.out.println("1's count " + cou1);
        System.out.println("0's count " + cou0);
    }
}
