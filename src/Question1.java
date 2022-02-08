import java.text.Collator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class Question1 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        System.out.print("Enter a list in ascending order : ");
        while (sc.hasNextInt()){
            list.add(sc.nextInt());
        }
        System.out.println("Before: " + list);
        System.out.print("Enter a value to be added into the list : ");
        sc.next();
        int val = sc.nextInt();
        addAndSort(list, val);
        System.out.println("After: " + list);
    }

    public static void addAndSort(LinkedList<Integer> list, int value){
        list.add(value);
        list.sort(Comparator.naturalOrder());
    }
}
