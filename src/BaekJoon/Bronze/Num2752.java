package BaekJoon.Bronze;

import java.util.Scanner;

public class Num2752 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] num = new int[3];
        int [] maxNum = new int[3];

        for(int i=0; i<3; i++) {
            num[i] = sc.nextInt();
        }

        for(int i=0; i<num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] > num[j]) { //오름차순
                    int tmp = num[i];
                    num[i] = num[j];
                    num[j] = tmp;
                }
            }
        }

        for(int i=0; i<num.length; i++) {
            for(int j=i+1; j<num.length; j++) {
                if(num[i] < num[j]) { //내림차순
                    int tmp = num[i];
                    num[i] = num[j];
                    num[j] = tmp;
                }
            }
        }


        for(int i=0; i<3; i++){
            System.out.print(num[i]+" ");
        }
    }
}
