public class Main {
    public static void main(String[] args) {
        printNumbers(5, 10);
    }

    public static void printNumbers(int m, int n) {
        if (m > n) {
            return;
        }
        System.out.println(m);
        printNumbers(m + 1, n);
    }
}