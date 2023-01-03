package BaekJoon.Silver;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Num2161 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=1; i<=n; i++){
            queue.add(i);
        }
        while (true){
            System.out.print(queue.remove()+" ");
            if(queue.isEmpty()) break;
            queue.add(queue.remove());
        }
    }
}
