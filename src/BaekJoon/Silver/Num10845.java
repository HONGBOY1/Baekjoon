package BaekJoon.Silver;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Num10845 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> queue = new LinkedList<Integer>();
        int back=0;
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            String str=br.readLine();
            String arr[] = str.split(" ");
            switch (arr[0]) {
                case "push":
                    back = Integer.valueOf(arr[1]);
                    queue.add(back);
                    break;
                case "pop":
                    if (queue.isEmpty()) bw.write("-1\n");
                    else bw.write(queue.remove() + "\n");
                    break;
                case "size":
                    bw.write(queue.size()+"\n");
                    break;
                case "empty":
                    if (queue.isEmpty()) bw.write(1+"\n");
                    else bw.write(0+"\n");
                    break;
                case "front":
                    if (queue.isEmpty()) bw.write(-1+"\n");
                    else bw.write(queue.peek()+"\n");
                    break;
                case "back":
                    if (queue.isEmpty()) bw.write(-1+"\n");
                    else bw.write(back+"\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
