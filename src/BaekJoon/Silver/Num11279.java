package BaekJoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Num11279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        int N=Integer.parseInt(st.nextToken());
        for(int i = 0; i < N; i++) {
            int x = Integer.parseInt(br.readLine());
            if(x == 0) {
                if(pq.isEmpty()) sb.append(0).append("\n");
                else {
                    sb.append(pq.poll()).append("\n");
                }
            }else {
                pq.offer(x);
            }
        }
        System.out.println(sb);
    }
}
