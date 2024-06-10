package BaekJoon.Silver;

import java.util.Scanner;

public class Num1012 {

    static int a, b, c;
    static int[][] arr;
    static boolean[][] visit;
    static int count;
    static int[] dx = { 0, -1, 0, 1 };
    static int[] dy = { 1, 0, -1, 0 };

    static void dfs(int x, int y) {
        visit[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int cx = x + dx[i];
            int cy = y + dy[i];

            if (cx >= 0 && cy >= 0 && cx < a && cy < b) {
                if (!visit[cx][cy] && arr[cx][cy] == 1) {
                    dfs(cx, cy);
                }
            }

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        for(int i = 0; i<n ; i++){
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            count=0;
            arr = new int [a][b];
            visit = new boolean[a][b];
            for(int j=0; j<c; j++){
                int x=sc.nextInt();
                int y=sc.nextInt();
                arr[x][y]=1;
            }

            for (int x = 0; x < a; x++) {
                for (int y = 0; y < b; y++) {
                    if (arr[x][y] == 1 && !visit[x][y]) {
                        dfs(x, y);
                        count++;
                    }
                }
            }

            System.out.println(count);
        }

    }
}

