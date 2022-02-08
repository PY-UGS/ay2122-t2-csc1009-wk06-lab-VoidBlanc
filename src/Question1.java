import java.text.Collator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class Question1 {

    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,3,5,7,9,11));
        System.out.println("Before: " + list);
        addAndSort(list, 6);
        System.out.println("After: " + list);
    }

    public static void addAndSort(LinkedList<Integer> list, int value){
        list.add(value);
        list.sort(Comparator.naturalOrder());
    }
}
