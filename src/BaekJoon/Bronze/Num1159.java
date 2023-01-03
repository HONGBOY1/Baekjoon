package BaekJoon.Bronze;

import java.util.Scanner;

public class Num1159 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        String str,sum="";
        int arr[] = new int [26];
        for(int i=0; i<n; i++){
            str = sc.next();
            arr[str.charAt(0)-97]++;
        }

        for(int i=0; i< arr.length;i++){
            if(arr[i]>=5) {
                sum += String.valueOf((char) (i + 97));
            }
        }
        if(sum=="")
            System.out.println("PREDAJA");
        else{
            System.out.println(sum);
        }
    }
}
