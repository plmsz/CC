public class FatorialRecursao2 {
    public static void fatorial(int n, int acc) {
        if (n > 1) {
            fatorial(n - 1, acc * n);
        } else {
            System.out.println("fatorial é " + acc);
        }
    }

    public static void main(String[] args) {
        fatorial(3, 1);
    }
}
