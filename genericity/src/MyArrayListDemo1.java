import java.util.ArrayList;

public class MyArrayListDemo1 {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("Java");
        list.add("JavaScript");
        list.add("TypeScript");
        System.out.println(list);

        list.remove("TypeScript");
        System.out.println(list);
    }
}

class MyArrayList<E> {
    private ArrayList lists = new ArrayList<>();
    public void add(E e) {
        lists.add(e);
    }
    public void remove(E e) {
        lists.remove(e);
    }

    @Override
    public String toString() {
        return lists.toString();
    }
}
