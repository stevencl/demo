package com.example;
import java.util.ArrayList;
import java.util.stream.IntStream;

/**
 * Class to store collections of numbers.
 */
public class NumberCollections {
    private ArrayList<Integer> divisibleNumbers;
    private ArrayList<Integer> primeNumbers;

    public NumberCollections(int a, int b) {
        
        IntStream.rangeClosed(a, b).filter(i -> i % a == 0).forEach(divisibleNumbers::add);
        IntStream.rangeClosed(a, b).filter(this::isPrime).forEach(primeNumbers::add);
    }

    private boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "{\n    \"divisible\": " + divisibleNumbers + ",\n    \"prime\": " + primeNumbers + "\n}";
    }
}