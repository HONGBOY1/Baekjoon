package BaekJoon.Bronze;


import java.util.Scanner;


public class Num1264 {
    public static void main(String[] args) {
        char[] aeiou = new char [] { 'A', 'E', 'I', 'O', 'U'};
        Scanner sc = new Scanner(System.in);

        while(true){
            String input = sc.nextLine();
            input=input.toUpperCase();

            if (input.equals("#")) { break; }

            int cnt=0;
            for(int j=0; j<input.length(); j++) {
                for (int i = 0; i < aeiou.length; i++) {
                    if (input.charAt(j) == aeiou[i]) {
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }
    }
}
