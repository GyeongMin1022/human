package helloworld.main;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long calc = 1;
        for (int i = n; i > 0; i--) {
            calc *= i;
        }
        System.out.println(calc);
    }
}