package BaekJoon.Silver;

import java.util.Scanner;

public class Num1120 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dab = sc.next();
        String chk = sc.next();
        int cnt = dab.length();
        int min = cnt;
        for(int i=0; i<=chk.length()-dab.length(); i++){
            cnt = dab.length();
            for(int j=0; j<dab.length(); j++){
                if(chk.charAt(j+i) == dab.charAt(j)){
                    cnt--;
                }
            }
            if(min > cnt ){
                min=cnt;
            }
        }
        System.out.println(min);
    }
}
