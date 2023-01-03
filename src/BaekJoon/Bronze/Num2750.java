package BaekJoon.Bronze;

import java.util.Arrays;
import java.util.Scanner;

public class Num2750 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int [] num = new int [n];
        int age=0;
        for(int i=0; i<n; i++){
            num[i]=sc.nextInt();
        }
        Arrays.sort(num);
        for(int i=0; i<n; i++){
            System.out.println(num[i]);
        }
        /*
       for(int i=0; i<n; i++){
            num[i]=sc.nextInt();
        }
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n;j++){
                if(num[i] > num[j]){
                    age=num[i];
                    num[i]=num[j];
                    num[j]=age;
                }
            }
        }
        for(int i=0; i<n; i++){
            System.out.println(num[i]);
        }
        */
    }
}
