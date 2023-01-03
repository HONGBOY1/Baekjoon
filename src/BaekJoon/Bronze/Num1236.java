package BaekJoon.Bronze;

import java.util.Scanner;

public class Num1236 {
    public static void main(String[] args) {
        // 나중에 다시 풀기
        Scanner sc = new Scanner(System.in);
        int x,y;
        int cnt=0,cnt1=0;
        x=sc.nextInt();
        y=sc.nextInt();
        char[][] wall = new char[x][y];

        for(int i=0; i<wall.length; i++){
            String str = sc.next();
            for(int j=0; j<wall[i].length;j++){
                wall[i][j]=str.charAt(j);
            }
        }
        int row=0, col=0;
        for(int i=0; i<x; i++){
            boolean flag = true;
            for(int j=0; j<y; j++){
                if(wall[i][j]=='X'){
                    flag = false;
                    break;
                }
            }
            if(flag)
                row++;
        }
        for(int i=0; i<y; i++){
            boolean flag = true;
            for(int j=0; j<x; j++){
                if(wall[j][i]=='X'){
                    flag = false;
                    break;
                }
            }
            if(flag)
                col++;
        }

        System.out.println(Math.max(row, col));
    }
}
