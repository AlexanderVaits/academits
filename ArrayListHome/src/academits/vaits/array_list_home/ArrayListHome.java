package academits.vaits.array_list_home;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListHome {
    public static ArrayList<String> getFileLines(String path) throws FileNotFoundException {
        ArrayList<String> lines = new ArrayList<>();

        try (Scanner scanner = new Scanner(new FileInputStream(path))) {
            while (scanner.hasNextLine()) {
                lines.add(scanner.nextLine());
            }
        }

        return lines;
    }

    public static void deleteEvenNumbers(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); ) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
            } else {
                i++;
            }
        }
    }

    public static ArrayList<Integer> getUniqueNumbers(ArrayList<Integer> list) {
        ArrayList<Integer> uniqueNumbersList = new ArrayList<>(list.size());

        for (Integer integer : list) {
            if (!uniqueNumbersList.contains(integer)) {
                uniqueNumbersList.add(integer);
            }
        }

        return uniqueNumbersList;
    }

    public static void main(String[] args) {
        // getLines test
        Scanner scanner = new Scanner(System.in);

        System.out.println("Укажите путь к файлу");
        String path = scanner.nextLine();

        try {
            ArrayList<String> lines = getFileLines(path);
            System.out.println("Строки файла: " + lines);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

        // deleteOddNumbers test
        ArrayList<Integer> numbersList1 = new ArrayList<>(Arrays.asList(1, 2, 4, 3, 4, 4, 8));
        deleteEvenNumbers(numbersList1);
        System.out.println("Нечетные числа списка: ");
        System.out.println(numbersList1);

        // getUniqueNumbers test
        ArrayList<Integer> numbersList2 = new ArrayList<>(Arrays.asList(1, 3, 4, 5, null, 3, 5, 7, 7, 7, 7, 7));
        System.out.println("Уникальные элементы списка: ");
        System.out.println(getUniqueNumbers(numbersList2));
    }
}