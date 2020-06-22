package ru.geekbrains.part1.lesson2;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Ваша задача - угадать число");
        System.out.println("Введите диапазон, которому будет принадлежать угадываемое число");
        int range = scanner.nextInt();
        playLevel(range);
        scanner.close();
    }
    private static void playLevel (int range){
        int number = (int)(Math.random() * range);
        int max_count = 3;
        int count = 0;
        while (true){
            System.out.println("Угадайте число от 0 до " + range);
            int input_number = scanner.nextInt();
            if (input_number == number)
            {
                System.out.println("Вы угадали");
                break;
            }
            else if (input_number > number)
            {
                System.out.println("Загаданное число меньше");
                count = count + 1;
            }
            else if (input_number < number)
            {
                System.out.println("Загаданное число больше");
                count = count + 1;
            }
            if (count == max_count)
            {
                System.out.println("Вы проиграли. Если хотите сыграть ещё, нажмите 1, если хотите выйти, нажмите 0");
                int exitTrigger = scanner.nextInt();
                if (exitTrigger == 1)
                {
                    count = 0;
                }
                else {
                    break;
                }
            }

        }
    }
}
