import java.util.LinkedList;

public class ListManager {
    public ListManager() {
    }

    public void addAndSort(LinkedList<Integer> list, int value){
        System.out.println("Before: " + list);
        list.add(value);
        System.out.println("After: " + list);
    }
}
