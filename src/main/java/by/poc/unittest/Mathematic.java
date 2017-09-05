package by.poc.unittest;

public class Mathematic {
    public int add(int a, int b) {
        int base = a;
        int power = b;
        return ((int) Math.pow(base,power));

    }
    public int remove(final int a, final int b) {
        return a % b;
}}
