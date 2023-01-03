package BaekJoon.Silver;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Num1158 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        System.out.print("<");

        for(int i=1; i<=n;i++){
            queue.add(i);
        }
        while (queue.size()>1){
            for(int i =0; i<m-1;i++) {
                int value = queue.poll();
                queue.offer(value);
            }
            System.out.print(queue.poll()+", ");
        }
        System.out.println(queue.poll()+">");
    }
}
