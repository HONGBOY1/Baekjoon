package BaekJoon.Bronze;

import java.util.Scanner;

public class Num2908 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        String box[] =new String[2];
        String str[] = s.split(" ");
        int k=0;
        for(String arr : str){
            box[k]="";
            for(int i=2; i>=0; i--){
                box[k]+=arr.charAt(i);
            }
            k++;
        }
        System.out.println(Integer.parseInt(String.valueOf(box[0])) > Integer.parseInt(String.valueOf(box[1])) ? box[0] : box[1]);

    }

}
