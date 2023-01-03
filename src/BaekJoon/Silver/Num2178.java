package BaekJoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Num2178 {

    static int arr[][];
    static int n;
    static int m;
    static boolean vid[][];
    static int zx[]={1,-1,0,0};
    static int zy[]={0,0,1,-1};

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            n=Integer.parseInt(st.nextToken());
            m=Integer.parseInt(st.nextToken());
            arr = new int [n][m];

            for(int i=0; i<n; i++){
                String s = br.readLine();
                for(int j=0; j<m;j++){
                    arr[i][j]= s.charAt(j)-'0';
                }
            }
            vid = new boolean [n][m];
            vid[0][0]=true;
            bfs(0,0);
            System.out.println(arr[n-1][m-1]);


        }

        static void bfs(int x, int y){
            Queue<int []> q = new LinkedList<>();
            q.add(new int [] {x,y});

            while(!q.isEmpty()){
                int now[] = q.poll();
                int nowX = now[0];
                int nowY = now[1];

                for(int i=0; i<4; i++){
                    int nextX =nowX + zx[i];
                    int nextY =nowY + zy[i];

                    if (nextX < 0 || nextY < 0 || nextX >= n || nextY >= m)
                        continue;
                    if (vid[nextX][nextY] || arr[nextX][nextY] == 0)
                        continue;

                    q.add(new int[] {nextX, nextY});
                    arr[nextX][nextY] = arr[nowX][nowY] + 1;
                    vid[nextX][nextY] = true;

                }

            }
        }
}

