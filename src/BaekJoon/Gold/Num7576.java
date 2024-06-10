package BaekJoon.Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num7576 {

    static int n,m;
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

            if (cx >= 0 && cy >= 0 && cx < n && cy < m) {
                if (!visit[cx][cy] && arr[cx][cy] == 1) {
                    dfs(cx, cy);
                }
            }

        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                st = new StringTokenizer(br.readLine());
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int x = 0; x < n; x++) {
            for (int y = 0; y < m; y++) {
                if (arr[x][y] == 0 && !visit[x][y]) {
                    dfs(x, y);
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
