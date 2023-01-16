package BaekJoon.Silver;

import java.util.Scanner;

public class Num1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt =0;
        for(int i=1; i<=n; i++){
            if(i <= 99) cnt++;
            else{
                String[] str = Integer.toString(i).split("");
                if(Integer.parseInt(str[1]) - Integer.parseInt(str[0]) == Integer.parseInt(str[2]) - Integer.parseInt(str[1])){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
