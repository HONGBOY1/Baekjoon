package BaekJoon.Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num11729 {
    static int cnt = 0 ;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        hanoi(n,1,2,3);
        System.out.println(cnt);
        System.out.println(sb.toString());
    }
    static void hanoi(int n, int start, int mid, int to) {

        if (n==1){
            cnt++;
            sb.append(start + " " + to + "\n");
            return;
        }else{
            cnt++;
            hanoi(n-1,start,to,mid);
            sb.append(start + " " + to + "\n");;
            hanoi(n-1,mid,start,to);
        }
    }
}
