package ru.job4j.loop;

public class Factorial {


    public int calc(int n) {
        int fact;
        int start = 1;
        for (fact = 1 ; start <= n; start++){
            fact = fact * start;
        }
        return fact;
    }
}
