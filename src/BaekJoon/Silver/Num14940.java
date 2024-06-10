package BaekJoon.Silver;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Num14940 {
    static int n ;
    static int m ;

    static boolean  chk[][];
    static int arr[][];
    static int result[][];
    static int dx[]= {0,1,0,-1};
    static int dy[]= {-1,0,1,0};


    static  void bfs(int x, int y) {
        Queue<int[]> queue=new LinkedList<>();
        queue.add(new int[] {x,y});
        chk[x][y]=true;

        while(!queue.isEmpty()){
            int[] temp=queue.poll();
            for(int i=0;i<4;i++){
                int x1=temp[0]+dx[i];
                int y1=temp[1]+dy[i];
                if(x1>=0 && x1<n && y1>=0 && y1<m){
                    if(!chk[x1][y1] && arr[x1][y1]==1){
                        queue.add(new int[] {x1,y1});
                        result[x1][y1]=result[temp[0]][temp[1]]+1;
                        chk[x1][y1]=true;
                    }
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
        chk = new boolean[n][m];
        result=new int[n][m];

        int startX = 0, startY = 0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j]=Integer.parseInt(st.nextToken());
                if(arr[i][j]==2) {
                    startX=i;
                    startY=j;
                }else if(arr[i][j]==0) chk[i][j]=true;
            }
        }

        bfs(startX,startY);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(!chk[i][j]) { // 도달할 수 없는 위치
                    result[i][j]=-1;
                }
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }


    }
}
