package BaekJoon.Silver;

import java.util.Scanner;

public class Num1260 {

    static int n,m,x;
    static int arr[][] = new int [1001][10001];
    static int chk[] = new int [1001];
    static  int q[] = new int [1001];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        int str = sc.nextInt();


        for(int i=0; i<m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[a][b]=arr[b][a]=1;
        }
        DFS(str);
        for(int i=0;i<=n; i++){
            chk[i]=0;
        }
        System.out.println();
        BFS(str);
    }

    static void BFS(int k){
        int st, ed;
        st=ed=-1;
        q[++st]=k;
        chk[k]=1;
        while (st != ed){
            x=q[++ed];
            System.out.print(x+" ");
            for(int i=1; i<=n; i++){
                if(arr[x][i]==1  && chk[i]==0) {
                    q[++st]=i;
                    chk[i]=1;
                }
            }
        }

    }
    static void DFS(int k){
        chk[k]=1;
        System.out.print(k+" ");
        for(int i=0; i<=n;i++){
            if(arr[k][i]==1  && chk[i]==0) {
                DFS(i);
            }
        }
    }
}
