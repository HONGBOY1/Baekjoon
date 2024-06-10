package BaekJoon.Silver;

import java.util.Scanner;

public class Num9655 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int chk = 1;
        while  (n > 0){
            if(n%3 == 0) n-=3;
            else n--;
            chk *= -1;
        }
        if(chk > 0) System.out.println("CY");
        else   System.out.println("SK");
    }
}
