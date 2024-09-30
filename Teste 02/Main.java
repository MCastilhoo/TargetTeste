import service.FibonacciService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        FibonacciService fibonacciService = new FibonacciService();

        System.out.println("Por favor informe um número: ");
        int numero = input.nextInt();

        String resultado = fibonacciService.verificarFibonacci(numero);
        System.out.println(resultado);
    }
}
