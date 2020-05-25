package Lession14;

public class HomeWork {
    public static void main(String[] args) {
    }

    public static int printFactorial(int n) {
        if (n == 1) {
            return 1;
        }
        int n1 = printFactorial(n - 1);
        return n1;
    }

}
