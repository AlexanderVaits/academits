import java.util.NoSuchElementException;

class List<T> {
    private ListItem<T> head;
    private int size = 0;

    public List(ListItem<T> head, int size) {
        this.head = head;
        this.size = size;
    }

    public List() {
    }

    public int getSize() {
        return size;
    }

    public T getFirst() {
        final ListItem<T> f = head;
        if (f == null) {
            throw new NoSuchElementException();
        }
        return f.getData();
    }

    public T getByIndex(int index) throws Exception {
        if (size < index || index < 0) {
            throw new Exception("Incorrect index value");
        }

        int count = 0;
        ListItem<T> temp = head;

        while (count < index) {
            temp = temp.getNext();
            count++;
        }

        return temp.getData();
    }

    public T replace(T data, int index) throws Exception {
        if (size < index || index < 0) {
            throw new Exception("Incorrect index value");
        }

        int count = 0;
        ListItem<T> temp = head;

        while (count < index) {
            temp = temp.getNext();
            count++;
        }

        ListItem<T> current = temp;
        temp.setData(data);

        return current.getData();
    }

    public void add(T data) {
        head = new ListItem<T>(data, head);
        size++;
    }

    public void add(T data, int index) {
        if (index > size || index < 0) {
            throw new NoSuchElementException();
        }

        int count = 0;
        ListItem<T> temp = head;

        while (count < index - 1) {
            temp = temp.getNext();
            count++;
        }

        ListItem<T> newItem = new ListItem<>(data, temp.getNext());
        temp.setNext(newItem);
        size++;
    }

    public T getDeletedByIndex(int index) {
        if (index > size || index < 0) {
            throw new NoSuchElementException();
        }

        int count = 0;
        ListItem<T> temp = head;

        while (count < index - 1) {
            temp = temp.getNext();
            count++;
        }

        ListItem<T> deletedItem = new ListItem<>(temp.getNext());
        temp.setNext(deletedItem.getNext());
        size--;

        return deletedItem.getData();
    }

    public T removeFirst() {
        size--;
        ListItem<T> deleted = head;
        head = head.getNext();
        return deleted.getData();
    }

    public boolean remove(T data) {
        for (ListItem<T> p = head; p != null; p = p.getNext()) {
            if (p.getData().equals(data)) {
                ListItem<T> deleted = new ListItem<>(data, p);
                p.setNext(deleted.getNext());

                return true;
            }
        }

        return false;
    }

    public List reverse() {
        List<T> reversedList = new List<>();
        ListItem<T> temp = head;

        while (temp != null) {
            reversedList.add(temp.getData());
            temp = temp.getNext();
        }

        return reversedList;
    }

    public List copy() {
        List<T> reversedList = new List<>();
        List<T> clonedList = new List<>();

        ListItem<T> temp1 = head;
        ListItem<T> temp2 = head;

        while (temp1 != null) {
            while (temp2 != null) {
                reversedList.add(temp2.getData());
                temp2 = temp2.getNext();
                temp1 = reversedList.head;
            }
            clonedList.add(temp1.getData());
            temp1 = temp1.getNext();
        }

        return clonedList;
    }

    public void print() {
        ListItem<T> temp = head;

        while (temp != null) {
            System.out.println(temp.getData() + "\n");
            temp = temp.getNext();
        }
    }
}