package com.example;
import java.util.ArrayList;

/**
 * Class to store collections of numbers.
 */
public class NumberCollections {
    private ArrayList<Integer> divisibleNumbers;
    private ArrayList<Integer> primeNumbers;

    public NumberCollections(int a, int b) {
        
        divisibleNumbers = new ArrayList<>();
        primeNumbers = new ArrayList<>();
        for (int i = 0; i <= b; i++) {
            if (i % a == 0) {
                divisibleNumbers.add(i);
            }
            if (isPrime(i)) {
                primeNumbers.add(i);
            }
        }
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