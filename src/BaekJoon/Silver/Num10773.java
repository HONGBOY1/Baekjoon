package BaekJoon.Silver;

import java.util.Scanner;

public class Num10773 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int st[] = new int[n];
        int top=0;
        for(int i=0; i<n; i++) {
            int num = sc.nextInt();
            if (num == 0) st[--top] = 0;
            else st[top++] = num;
        }
        int sum=0;
        for(int i=0; i<top; i++){
            sum+=st[i];
        }
        System.out.println(sum);
    }
}
