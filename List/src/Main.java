import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws Exception {
        List list = new List();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.print();

        List reversedList = list.reverse();
        reversedList.print();

        List clonedList = list.copy();
        clonedList.print();
    }
}
