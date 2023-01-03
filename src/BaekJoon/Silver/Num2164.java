package BaekJoon.Silver;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Num2164 {
    public static void main(String[] args) throws IOException {
        Queue<Integer> queue = new LinkedList<Integer>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for(int i=1; i<=n; i++){
            queue.add(i);
        }
        while(n!=1){
            queue.remove();
            if(queue.size()==1)break;
            queue.add(queue.remove());
        }

        bw.write(queue.peek()+"\n");

        bw.flush();
        bw.close();
    }
}
