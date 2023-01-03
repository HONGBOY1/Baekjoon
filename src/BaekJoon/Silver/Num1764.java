package BaekJoon.Silver;

import java.util.*;

public class Num1764 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();

        HashSet<String> map_str = new HashSet();
        ArrayList<String> arr_str = new ArrayList<>();
        String[] str = new String[m];
        for(int i=0; i<n; i++){
            String name= sc.next();
            map_str.add(name);
        }
        int k=0;
        for(int i=0; i<m; i++){
            String name = sc.next();
            if(map_str.remove(name)) arr_str.add(name);
        }
        Collections.sort(arr_str);

        System.out.println(arr_str.size());
        for (String s : arr_str) {
            System.out.println(s);
        }
    }
}
