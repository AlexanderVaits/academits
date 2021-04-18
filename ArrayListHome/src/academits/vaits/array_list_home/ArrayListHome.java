package academits.vaits.array_list_home;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
        list.removeAll(Collections.singleton(null));

        for (int i = 0; i < list.size(); ) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
            } else {
                i++;
            }
        }
    }

    public static ArrayList<Integer> getUniqueNumbers(ArrayList<Integer> list) {
        ArrayList<Integer> newList = new ArrayList<>();
        newList.ensureCapacity(list.size());

        for (Integer integer : list) {
            if (!newList.contains(integer)) {
                newList.add(integer);
            }
        }

        return newList;
    }

    public static void main(String[] args) {
        // getLines test
        Scanner scanner = new Scanner(System.in);

        System.out.println("Укажите путь к файлу");
        String path = scanner.nextLine();

        try {
            System.out.println("Строки файла:");
            System.out.println(getFileLines(path));
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

        // deleteOddNumbers test
        ArrayList<Integer> oddNumbersList = new ArrayList<>(Arrays.asList(1, 2, 4, 3, 4, 4, 8));
        deleteEvenNumbers(oddNumbersList);
        System.out.println("Нечетные числа списка: ");
        System.out.println(oddNumbersList);

        // getUniqueNumbers test
        ArrayList<Integer> uniqueNumbersList = new ArrayList<>(Arrays.asList(1, 3, 4, 5, null, 3, 5, 7, 7, 7, 7, 7));
        System.out.println("Уникальные элементы списка: ");
        System.out.println(getUniqueNumbers(uniqueNumbersList));
    }
}