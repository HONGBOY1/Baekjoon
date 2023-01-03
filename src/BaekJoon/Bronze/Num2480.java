package BaekJoon.Bronze;

import java.util.Scanner;

public class Num2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] cnt = new int[6];
        int N = 0, big = 0;
        int sum = 0;
        int cnt2=0;
        for (int i = 0; i < 3; i++) {
            N = sc.nextInt();
            switch (N) {
                case 1:
                    cnt[0]++;
                    break;
                case 2:
                    cnt[1]++;
                    break;
                case 3:
                    cnt[2]++;
                    break;
                case 4:
                    cnt[3]++;
                    break;
                case 5:
                    cnt[4]++;
                    break;
                case 6:
                    cnt[5]++;
                    break;
            }
            if (N > big) big = N;
        }
        for (int i = 0; i < 6; i++) {
            if (cnt[i] == 3) {
                N = i+1;
                cnt2=3;
            }
            else if (cnt[i] == 2) {
                N = i+1;
                cnt2 = 2;
            }
        }

        if (cnt2 == 2) {
            sum = 1000 + (N * 100);
        } else if (cnt2 == 3) {
            sum = 10000 + (N * 1000);
        } else {
            sum = (big * 100);
        }
        System.out.println(sum);
    }
}
