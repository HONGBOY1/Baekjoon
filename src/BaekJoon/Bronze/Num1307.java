package BaekJoon.Bronze;

import java.util.Scanner;

public class Num1307 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        n=sc.nextInt();
        int arr[][] = new int [n][n];
        if(n%2==0){
        int len = arr.length;
        for (int i = 0; i < len*len; i++) { // 15까지 입력을 해야한다 여기 +1하면 16
            arr[i/len][i%len] = i+1;
        }}
        else {
            int x = 0, y = n / 2, cnt = 1;
            int zx, zy;
            for (int i = 0; i < n * n; i++) {
                arr[x][y] = cnt++;
                zx = x;
                zy = y;

                x--;
                y++;

                if (x < 0) x = n - 1;
                if (y >= n) y = 0;

                if (arr[x][y] != 0) {
                    x = zx + 1;
                    y = zy;
                }
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
