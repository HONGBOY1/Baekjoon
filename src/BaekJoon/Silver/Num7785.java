package BaekJoon.Silver;


import java.util.*;

public class Num7785 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String,String> map_str = new HashMap();

        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            String name = sc.next();
            String enter = sc.next();
            if (map_str.containsKey(name)) {
                map_str.remove(name);
            } else {
                map_str.put(name, enter);
            }
        }
        ArrayList<String> list = new ArrayList<String>(map_str.keySet());
        Collections.sort(list, Collections.reverseOrder());
        for (String s: list
             ) {
            System.out.println(s);
        }

    }

}
