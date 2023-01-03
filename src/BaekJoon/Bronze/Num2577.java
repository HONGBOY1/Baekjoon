package BaekJoon.Bronze;

import java.util.Scanner;

public class Num2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
         int temp,save;
         int[] num = new int[10];
         String sum;
         save=(a*b*c);
         sum=String.valueOf(save);

         String[] ArrayStrings = sum.split("");
         for (String s : ArrayStrings) {
             temp = Integer.parseInt(s);
             for(int i=0; i<=9; i++){
                 if(temp==i){
                     num[i]++;
                 }
             }
         }
         for(int i=0; i<=9; i++){
             System.out.println(num[i]);
         }

    }
}
