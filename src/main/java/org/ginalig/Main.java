package org.ginalig;

import java.util.ArrayList;

public class Main {

    public static ArrayList<Integer> randomArrayList() {
        ArrayList<Integer> randomArrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            randomArrayList.add((int) (Math.random() * 100));
        }
        return randomArrayList;
    }

    public static int getMax(ArrayList<Integer> arrayList) {
        int max = arrayList.get(0);
        for (Integer integer : arrayList) {
            if (integer > max) {
                max = integer;
            }
        }
        return max;
    }

    public static int getMin(ArrayList<Integer> arrayList) {
        int min = arrayList.get(0);
        for (Integer integer : arrayList) {
            if (integer < min) {
                min = integer;
            }
        }
        return min;
    }

    public static double getAverage(ArrayList<Integer> arrayList) {
        double sum = 0;
        for (Integer integer : arrayList) {
            sum += integer;
        }
        return sum / arrayList.size();
    }

    public static ArrayList<Integer> getPrimes(int n) {
        var isPrime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }
        for (int i = 1; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        var primes = new ArrayList<Integer>();
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }
        return primes;
    }

    public static void main(String[] args) {
        var arr = randomArrayList();
        System.out.println(arr);
        System.out.printf("Max: %d, Min: %d, Average: %f\n", getMax(arr), getMin(arr), getAverage(arr));
        System.out.printf("PRIMES: ");
        System.out.println(getPrimes(100));
    }
}