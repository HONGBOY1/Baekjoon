package BaekJoon.Bronze;

import java.util.Scanner;

public class Num27294 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int set = sc.nextInt();
        int n = sc.nextInt();
        int dab = 280;
        if(set <= 16 && set >= 12){
           dab=320;
        }
        if(n==1) dab=280;
        System.out.println(dab);

    }
}
