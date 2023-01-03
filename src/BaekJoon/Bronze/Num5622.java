package BaekJoon.Bronze;

import java.util.Scanner;

public class Num5622 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int sum=0;
        for(int i=0; i<str.length(); i++){
            switch (str.charAt(i)) {
                case '1':
                    sum += 2;
                    break;
                case '2':
                case 'A':
                case 'B':
                case 'C':
                    sum += 3;
                    break;
                case '3':
                case 'D':
                case 'E':
                case 'F':
                    sum += 4;
                    break;
                case '4':
                case 'G':
                case 'H':
                case 'I':
                    sum += 5;
                    break;
                case '5':
                case 'J':
                case 'K':
                case 'L':
                    sum += 6;
                    break;
                case '6':
                case 'M':
                case 'N':
                case 'O':
                    sum += 7;
                    break;
                case '7':
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                    sum += 8;
                    break;

                case '8':
                case 'T':
                case 'U':
                case 'V':
                    sum += 9;
                    break;
                case '9':
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    sum += 10;
                    break;
                case '0':
                    sum += 11;
                    break;
            }
        }
        System.out.println(sum);
    }
}
