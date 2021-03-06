import java.util.*;

public class Question4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of list  : ");
        int size = sc.nextInt();
        HashMap<Integer,Integer> list = new HashMap<>();
        System.out.print("Enter a list in ascending order : ");
        for (int i = 1; i <= size; i++) {
            int inputval = sc.nextInt();
            list.put(i, inputval);
        }

        System.out.println("Before: " + list);
        System.out.print("Enter a value to be added into the list : ");
        int val = sc.nextInt();
        addAndSort(list, val);
        System.out.println("After: " + list);
    }

    public static void addAndSort(HashMap<Integer,Integer> hashlist, int value){
        hashlist.put(hashlist.size()+1, value);
        boolean swapped;
        for(int i =1; i <= hashlist.size(); i++){
            swapped = false;
            for(int j =1; j <= hashlist.size()-i; j++){
                if(hashlist.get(j) > hashlist.get(j+1)){
                    swapValues(hashlist, j, j+1);
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }

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
