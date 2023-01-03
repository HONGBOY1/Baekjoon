package BaekJoon.Bronze;

import java.util.Scanner;

public class Num4153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            int a= sc.nextInt(), b=sc.nextInt(),c=sc.nextInt();
            int sum=(a+b+c);
            if(sum==0) break;
            sum=sum%12;
            if(sum%2==0) System.out.println("right");
            else System.out.println("wrong");
        }
    }
}
