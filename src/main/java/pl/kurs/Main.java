package pl.kurs;

import java.util.Scanner;

public class Main {

    public static int[] getNumberFromUser(int n) {

        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Podaj liczbę: " + (i + 1));
            numbers[i] = scanner.nextInt();
        }
        scanner.close();
        return numbers;
    }


    public static void main(String[] args) {
        int n = 5;
        int[] numbers = getNumberFromUser(n);
        System.out.println("Wprowadzone liczby: ");
        for (int number : numbers) {
            System.out.println(number + " ");
        }
    }

}
