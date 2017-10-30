package Main;

import Calculator.Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(Calculator.eval(str));
        System.out.println("Sashka teper nemnogo kapuchinka");
    }
}