package BaekJoon.Bronze;

import java.util.Scanner;

public class Num1100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String []box = new String [8];
        for(int i=0; i<8;i++){
            box[i]=sc.nextLine();

        }
        int cnt=0;
        for(int i=0; i<8;i++){
            if(i%2==0){
                if(box[i].charAt(i) == 'F') cnt++;
            }
            else{
                if(box[i].charAt(i) == 'F') cnt++;
            }

        }
        System.out.println(cnt);
    }
}
