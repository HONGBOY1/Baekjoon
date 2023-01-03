package BaekJoon.Bronze;

import java.util.Scanner;

public class Num1225 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        long sum=0;
        String[] ArrayString1 = a.split("");
        String[] ArrayString2 = b.split("");
        for(String s : ArrayString1){
            for(String ss : ArrayString2) {
                sum+=(Long.parseLong(s)*Long.parseLong(ss));
            }
        }
        System.out.println(sum);
    }

}

