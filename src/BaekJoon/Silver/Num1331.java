package BaekJoon.Silver;

import java.util.Scanner;

public class Num1331 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[][] chess = new boolean[7][7];
        String str = sc.next();
        int x = str.charAt(0) - 64;
        int y = str.charAt(1) - 48;
        int firstx = x, firsty = y,prex = 0, prey = 0;
        String answer = "Invalid";
        for(int i=2; i<=36; i++){
            prex = x; prey = y;
            str = sc.next();
            x = str.charAt(0) - 64;
            y = str.charAt(1) - 48;
            if(chess[x][y]) {
                break;
            }
            if((x == prex+2 || x == prex-2) && (y == prey+1 || y == prey-1)
                    || (x == prex+1 || x == prex-1) && (y == prey+2 || y == prey-2)){
                chess[x][y] = true;
            }
            else{
                break;
            }
            if(i==36 &&((x == firstx+2 || x == firstx-2) && (y == firsty+1 || y == firsty-1)
                    || (x == firstx+1 || x == firstx-1) && (y == firsty+2 || y == firsty-2))){
                answer="Valid";
            }

        }
        System.out.println(answer);
    }
}
