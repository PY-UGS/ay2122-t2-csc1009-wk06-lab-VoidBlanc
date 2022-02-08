import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Random;

public class Question3 {
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>();
        int max = 9999;
        int min = 1000;
        int range = max - min + 1;
        int randval = 0;
        for (int i = 0; i < 500; i++){
            randval = (int) ((Math.random() * range) + 1000);
            list.add(randval);
        }
        randval = (int) ((Math.random() * range) + 1000);
        System.out.println("Before: " + list);
        System.out.println("Search: " + findValue(list, randval));
    }

    public static int findValue(LinkedList<Integer> list, int searchVal){
        if(list.contains(searchVal)) {
            return list.indexOf(searchVal);
        }else {
            return -1;
        }
    }
}
