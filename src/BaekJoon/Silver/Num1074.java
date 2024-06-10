package BaekJoon.Silver;

import java.util.Scanner;

public class Num1074 {
    static int N,R, C, ans = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         N = sc.nextInt();
         R = sc.nextInt();
         C = sc.nextInt();
        solve(0, 0, (int)Math.pow(2, N));

    }
    static void  solve (int r, int c, int size){
        if(size == 1) {
            System.out.println(ans);
            return;
        }
        int newSize = size / 2;
        if(R < r + newSize && C < c + newSize ) {
            solve(r, c, newSize);
        }
        if(R < r + newSize && c + newSize <= C) {
            ans += (size*size) / 4;
            solve(r, c+newSize, newSize);
        }
        if(r + newSize <= R && C < c + newSize ) {
            ans += ((size*size) / 4) * 2;
            solve(r+newSize, c, newSize);
        }
        if(r + newSize <= R && c + newSize <= C ) {
            ans += ((size*size) / 4) * 3;
            solve(r+newSize, c+newSize, newSize);
        }
    }
}
