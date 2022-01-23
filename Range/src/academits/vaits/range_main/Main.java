package academits.vaits.range_main;

import academits.vaits.range.Range;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        System.out.println("Работем с диапозоном!");
        System.out.println("Введите первое число диапазона: ");
        double from = scanner.nextDouble();

        System.out.println("Введите последнее число диапазона: ");
        double to = scanner.nextDouble();

        for (; ; ) {
            Range range = new Range(from, to);
            System.out.println("Длина диапозона равна: " + range.getLength());

            System.out.println("Введите число для проверки его принадлежности к заданному диапазону: ");
            double number = scanner.nextDouble();

            if (range.isInside(number)) {
                System.out.println("Принадлежит");
            } else {
                System.out.println("Не принадлежит");
            }

            System.out.println("Желаете изменить диапазон? (Ответ 'YES' при необходимости изменить диапазон или любое другое значение, если необходмость отсутствует)");
            scanner.nextLine();
            String answer = scanner.nextLine();

            String yes = "YES";

            if (answer.equals(yes)) {
                System.out.println("Введите новое значение первого числа диапазона: ");
                from = scanner.nextDouble();

                range.setFrom(from);

                System.out.println("Новое значение первого числа: " + range.getFrom());
                System.out.println("Введите новое значение последнего числа диапазона: ");
                to = scanner.nextDouble();

                range.setTo(to);

                System.out.println("Новое значение последнего числа: " + range.getTo());
            } else {
                break;
            }
        }

        */

        System.out.println("Введите начало первого диапазона:");
        double from1 = scanner.nextDouble();

        System.out.println("Введите конец первого диапазона:");
        double to1 = scanner.nextDouble();

        System.out.println("Введите начало второго диапазона:");
        double from2 = scanner.nextDouble();

        System.out.println("Введите конец второго диапазона:");
        double to2 = scanner.nextDouble();

        Range range1 = new Range(from1, to1);
        Range range2 = new Range(from2, to2);
        System.out.println(range1.getIntersection(range2));
        System.out.println(Arrays.toString(range1.getUnion(range2)));
        System.out.println(Arrays.toString(range1.getDifference(range2)));
    }
}