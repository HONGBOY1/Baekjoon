package BaekJoon.Silver;

import java.util.Scanner;

public class Num11047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int num = sc.nextInt();
        int[] won = new int[n];

        for(int i=0; i<n; i++){
            won[i]=sc.nextInt();
        }
        int cnt=0;
        for (int i = n-1; i >= 0; i--) {
            if (num-won[i] < 0)
                continue;
            if (num-won[i] >= 0) {
                while (num-won[i] >= 0) {
                    num -= won[i];
                    cnt++;
                }
            }
        }
        System.out.println(cnt);

    }
}
