package BaekJoon.Silver;

import java.util.Arrays;
import java.util.Scanner;

public class Num1920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int k=0; k<t; k++) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int m = sc.nextInt();
            int cnt[] = new int[m];
            int ck[] = new int[m];
            for (int i = 0; i < m; i++) {
                ck[i] = sc.nextInt();
            }

            for (int i = 0; i < m; i++) {
                int l = 0, r = n - 1;
                while (l <= r) {
                    int mid = (l + r) / 2;
                    if (ck[i] == arr[mid]) {
                        cnt[i]++;
                        break;
                    } else if (arr[mid] > ck[i]) {
                        r = mid - 1;
                    } else {
                        l = mid + 1;
                    }
                }
                System.out.print(cnt[i]);
            }
        }

    }
}
