package BaekJoon.Bronze;

import java.util.Scanner;

public class Num14467 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int [11][1];

        for(int i = 1; i < 11; i++) {
            arr[i][0] = -1;
        }

        int cnt= 0;
        for (int i = 0; i < n; i++) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(arr[a][0] == -1) {
                arr[a][0] = b;
            }
            else {
                if(arr[a][0] != b) {
                    cnt++;
                    arr[a][0] = b;
                }
            }
        }
        System.out.println(cnt);
    }
}
