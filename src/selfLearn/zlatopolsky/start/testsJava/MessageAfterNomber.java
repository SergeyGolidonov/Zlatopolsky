package selfLearn.zlatopolsky.start.testsJava;

import java.util.Scanner;

public class MessageAfterNomber {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Введите какое-нибудь число: ");
        int x = number.nextInt();
        System.out.println(x + " - вот такое число Вы ввели.\nПоздравляем, Вы красавчик!");

    }
}
