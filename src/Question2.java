import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,3,5,7,9,11));
        System.out.println("Before: " + list);
        System.out.println("Enter the index of the two value to be swapped : ");
        int indexOne = sc.nextInt();
        int indexTwo = sc.nextInt();
        swapValues(list, indexOne, indexTwo);
        System.out.println("After: " + list);
    }

    public static void swapValues(LinkedList<Integer> list, int indexOne, int indexTwo){
        int valIdxOne = list.get(indexOne);
        int valIdxTwo = list.get(indexTwo);
        list.remove(indexOne);
        list.add(indexOne, valIdxTwo);
        list.remove(indexTwo);
        list.add(indexTwo, valIdxOne);
    }
}
