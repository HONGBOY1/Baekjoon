package BaekJoon.Bronze;

import java.util.Scanner;

public class Num10102 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        String str = sc.next();
        int cnt1=0,cnt2=0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='A') cnt1++;
            else cnt2++;
        }
        if(cnt1 == cnt2) System.out.println("Tie");
        else if(cnt1 > cnt2) System.out.println("A");
        else System.out.println("B");
    }
}
