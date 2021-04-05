package academits.vaits.array_list_home;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListHome {
    public static ArrayList<String> getLines() throws FileNotFoundException {
        ArrayList<String> lines = new ArrayList<>();
        try (Scanner scanner = new Scanner(new FileInputStream("input.txt"))) {
            while (scanner.hasNextLine()) {
                lines.add(scanner.nextLine());
            }
        }
        return lines;
    }

    public static void deleteOddNumbers(ArrayList<Integer> list) {
        list.removeIf(x -> x % 2 == 1);
    }

    public static ArrayList<Integer> deleteRepeatingNumbers(ArrayList<Integer> list) {
        ArrayList<Integer> newList = new ArrayList<Integer>();

        for (int i = 0; i < list.size(); i++) {
            newList.add(list.get(i));

            for (int j = i + 1; j < list.size(); ) {
                if (list.get(i).equals(list.get(j))) {
                    list.remove(j);
                } else {
                    j++;
                }
            }
        }
        return newList;
    }

    public static void main(String[] args) {
        // getLines test
        try {
            System.out.println(getLines());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // deleteOddNumbers test
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        deleteOddNumbers(list1);
        System.out.println(list1);

        // deleteRepeatingNumbers test
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(5);
        list2.add(2);
        list2.add(1);
        list2.add(3);
        list2.add(5);
        System.out.println(deleteRepeatingNumbers(list2));
    }
}
