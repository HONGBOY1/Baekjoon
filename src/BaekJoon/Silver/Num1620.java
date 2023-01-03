package BaekJoon.Silver;

import java.util.HashMap;
import java.util.Scanner;

public class Num1620 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        HashMap<Integer, String> map_int = new HashMap<>();
        HashMap<String, Integer> map_str = new HashMap<>();

        for(int i=1; i<=n; i++){
            String name= sc.next();
            map_int.put(i,name);
            map_str.put(name,i);
        }

        for(int i=0; i<m;i++){
            String tmp=sc.next();
            if(isNum(tmp)) System.out.println(map_int.get(Integer.parseInt(tmp)));
            else System.out.println(map_str.get(tmp));
        }
    }
    public static boolean isNum(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
