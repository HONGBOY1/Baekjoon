package BaekJoon.Silver;

import java.util.Scanner;

public class Num1018 {
    public static boolean[][] arr;
    public static int min = 64;
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x= sc.nextInt();
        int y=sc.nextInt();

        arr = new boolean[x][y];

        // 배열 입력
        for (int i = 0; i < x; i++) {
            String str = sc.next();

            for (int j = 0; j < y; j++) {
                if (str.charAt(j) == 'W') {
                    arr[i][j] = true;		// W일 때는 true
                } else {
                    arr[i][j] = false;		// B일 때는 false
                }

            }
        }

        for(int i=0; i < x - 7; i++){
            for(int j=0; j < y-7; j++){
                chk(i,j);
            }
        }
        System.out.println(min);
    }
    static void chk(int x, int y){
        int cnt=0;
        boolean chk = arr[x][y];
        for(int i=x; i<x+8; i++){
            for(int j=y; j<y+8; j++){
                if(arr[i][j] != chk){
                    cnt++;
                }
                chk = (!chk);
            }
            chk = !chk;
        }
        cnt = Math.min(cnt, 64 - cnt);
        min = Math.min(min, cnt);
    }
}
