package BaekJoon.Bronze;

import java.util.Arrays;
import java.util.Scanner;

public class Num2309 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[9];
        int sum=0;
        for(int i=0; i<num.length; i++){
           sum+=num[i]=sc.nextInt();
        }
        int[] temp = new int[2];
        int sum2=sum-100;
        for(int i=0; i<9; i++){
            for(int j=i+1; j<9; j++){
                int save=num[i]+num[j];
                if(save==sum2) {
                    temp[0]=num[i];
                    temp[1]=num[j];
                }
            }
        }
        Arrays.sort(num);
        for(int i=0; i<9; i++){
            if(num[i] != temp[0] && num[i] != temp[1]){
                System.out.println(num[i]);
            }
        }
    }
}
