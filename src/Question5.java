import java.util.HashMap;
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        HashMap<Integer, Integer> hash = new HashMap<>();
        System.out.print("Enter the size of list  : ");
        int size = sc.nextInt();
        System.out.print("Enter a list in ascending order : ");
        for (int i = 1; i <= size; i++) {
            int inputval = sc.nextInt();
            hash.put(i, inputval);
        }
        System.out.println("Before: " + hash);
        System.out.println("Enter the index of the two value to be swapped : ");
        int indexOne = sc.nextInt();
        int indexTwo = sc.nextInt() ;
        swapValues(hash, indexOne, indexTwo);
        System.out.println("After: " + hash);
    }

    public static void swapValues(HashMap<Integer, Integer> list, int indexOne, int indexTwo){
        int valIdxOne = list.get(indexOne);
        int valIdxTwo = list.get(indexTwo);
        list.remove(indexOne);
        list.put(indexOne, valIdxTwo);
        list.remove(indexTwo);
        list.put(indexTwo, valIdxOne);
    }
}
