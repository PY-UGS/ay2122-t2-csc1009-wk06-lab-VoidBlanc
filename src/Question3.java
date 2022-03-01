import java.util.LinkedList;

public class Question3 {
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>();
        int max = 9999;
        int min = 1000;
        int range = max - min + 1;
        for (int i = 0; i < 500; i++){
            list.add((int) ((Math.random() * range) + 1000));
        }
        int searchval = (int)((Math.random() * range) + 1000);
        System.out.println("List    : " + list);
        System.out.println("Position of " + searchval +" : " + findValue(list, searchval));
    }

    public static int findValue(LinkedList<Integer> list, int searchVal){
        if(list.contains(searchVal)) {
            return list.indexOf(searchVal);
        }else {
            return -1;
        }
    }
}
