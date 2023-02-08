package BaekJoon.Silver;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Num1966 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        for(int i=0; i<t; i++){
            Queue<int[]> queue = new LinkedList<>();
            int n = sc.nextInt();
            int m = sc.nextInt();

            for(int j=0; j<n; j++){
                queue.offer(new int[]{j, sc.nextInt()});
            }

            int cnt=0;

            while (true){
                boolean max = true;
                int[] front = queue.remove();

                for (int q[] : queue) {
                    if(q[1] > front[1]) {
                        max = false;
                        break;
                    }
                }
                if(max) {
                    cnt++;
                    if(front[0] == m) break;
                }else {
                    queue.add(front);
                }
            }
            System.out.println(cnt);

        }
    }
}
