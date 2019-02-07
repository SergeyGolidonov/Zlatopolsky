package selfLearn.zlatopolsky.start.testsJava;

import java.util.Scanner;

public class EnterNumber {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Введите какое-нибудь число: ");
        int x = number.nextInt();
        System.out.println("Вы ввели число: " + x);
    }

}
