package utils;

public class Fibonacci {
    public static boolean pertence (int numero) {
        int a = 0, b = 1;

        while (a < numero){
            int proximo = a + b;
            a = b;
            b = proximo;
        }
        return a == numero;
    }
}
