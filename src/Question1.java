import java.util.LinkedList;
import java.util.Scanner;

public class Question1 {

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
        System.out.print("Enter a value to be added into the list : ");
        int val = sc.nextInt();
        addAndSort(list, val);
        System.out.println("After: " + list);
    }

    public static void addAndSort(LinkedList<Integer> list, int value){
        list.add(value);
        int j;
        boolean swapped;
        for(int i =0; i < list.size()-1; i++){
            swapped = false;
            for(j =0; j < list.size()-i-1; j++){
                if(list.get(j) > list.get(j+1)){
                    swapValues(list, j, j+1);
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
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
