package BaekJoon.Silver;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class Num10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Deque<String> deque = new ArrayDeque<>();

        int n=Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String str=br.readLine();
            String arr[] = str.split(" ");
            switch (arr[0]){
                case "push_front" :
                    deque.addFirst(arr[1]);
                    break;
                case "push_back" :
                    deque.addLast(arr[1]);
                    break;
                case "pop_front" :
                    if(deque.isEmpty()) bw.write(-1+"\n");
                    else bw.write(deque.removeFirst()+"\n");
                    break;
                case "pop_back" :
                    if(deque.isEmpty()) bw.write(-1+"\n");
                    else bw.write(deque.removeLast()+"\n");
                    break;
                case "size" :
                    bw.write(deque.size()+"\n");
                    break;
                case "empty" :
                    if(deque.isEmpty()) bw.write(1+"\n");
                    else bw.write(0+"\n");
                    break;
                case "front" :
                    if(deque.isEmpty()) bw.write(-1+"\n");
                    else bw.write(deque.getFirst()+"\n");
                    break;
                case "back" :
                    if(deque.isEmpty()) bw.write(-1+"\n");
                    else bw.write(deque.getLast()+"\n");
                    break;
            }
        }
        bw.flush();
        bw.close();
    }
}
