public class IsPowerOfTwo {
    public static void main(String[] args) {
        int a = 16;
        if ((a & (a - 1)) == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
