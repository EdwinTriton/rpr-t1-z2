package org.example;

import java.util.Scanner;

public class Main {

    public static int sumaCifara(int n) {
        if (n<0) n*=-1;
        int m = 0;
        while (n != 0) {
            m += n%10;
            n/=10;
        }
        return m;
    }

    public static void main(String[] args) {
        System.out.println("Unesi n:");
        Scanner ulaz = new Scanner(System.in);
        int n = ulaz.nextInt();
        for (int i=1; i<n; i++) {
            if (i%sumaCifara(i) == 0) System.out.print(i+" ");
        }
    }
}