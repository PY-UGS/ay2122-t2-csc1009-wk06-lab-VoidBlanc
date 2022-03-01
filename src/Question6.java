import java.util.HashMap;

public class Question6 {
    public static void main(String[] args){
        HashMap<Integer, Integer> list = new HashMap<>();
        int max = 9999;
        int min = 1000;
        int range = max - min + 1;
        for (int i = 0; i < 500; i++){
            list.put(i,(int) ((Math.random() * range) + 1000));
        }
        System.out.println("List    : " + list);
        System.out.println("Search  : " + findValue(list, (int) ((Math.random() * range) + 1000)));
    }

    public static int findValue(HashMap<Integer, Integer> list, int searchVal){
        for (int key: list.keySet()) {
            if(list.get(key).equals(searchVal)){
                return key;
            }
        }
        return -1;
    }
}
