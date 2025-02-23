public class FibonnaciRecursao {
    public static int fibb(int n) {
        if (n == 1 || n == 0) {
            return 1;
        } else {
            return fibb(n - 1) + fibb(n - 2);
        }

    }

    // 1 1 2 3 5 8 13 21 34 55 89 144 233
    public static void main(String[] args) {
        for (int i = 0; i <= 12; i++) {
            System.out.print(fibb(5) + " ");
        }
    }
}
