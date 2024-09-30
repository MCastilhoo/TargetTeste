package service;

import utils.Fibonacci;

public class FibonacciService {
    public String verificarFibonacci(int numero) {
        boolean pertence = Fibonacci.pertence(numero);
        return pertence
                ? String.format("O número %d pertence a sequência de Fibonacci.", numero)
                : String.format("O número %d não pertence a sequência de Fibonacci.", numero);
    }
}
