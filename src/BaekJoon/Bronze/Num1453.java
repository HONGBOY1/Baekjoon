package BaekJoon.Bronze;

import java.util.Scanner;

public class Num1453 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt=0;
        int num[] = new int[101];
        for(int i=0; i<n; i++){
            int st = sc.nextInt();
            num[st]++;
        }

        for(int i=0; i<101;i++){
            if(num[i] >= 2) cnt+=num[i]-1;
        }
        System.out.println(cnt);
    }
}
