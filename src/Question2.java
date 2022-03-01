import java.util.LinkedList;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        System.out.print("Enter the size of list  : ");
        int size = sc.nextInt();
        System.out.print("Enter a list in ascending order : ");
        for (int i = 0; i < size; i++) {
            int inputval = sc.nextInt();
            list.add(inputval);
        }
        System.out.println("Before: " + list);
        System.out.println("Enter the pos of the two value to be swapped : ");
        int indexOne = sc.nextInt() - 1;
        int indexTwo = sc.nextInt() - 1;
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
