package BaekJoon.Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Num3109{
    static int r,c,sw,dab;
    static char [][] map;
    static  void back(int x, int  y){
        if(sw==1) return;
        map[x][y]='x';
        if(y==c-1) { // 답 찾았다면
            sw=1;
            dab++;
            return;
        }

        if(sw==0 && x-1>=0 && map[x-1][y+1]=='.') back(x-1,y+1);
        if(sw==0  && map[x][y+1]=='.') back(x,y+1);
        if(sw==0 && x+1<r && map[x+1][y+1]=='.') back(x+1,y+1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        r = sc.nextInt();
        c = sc.nextInt();
        sc.nextLine();

        map = new char[r][c];

        for (int i = 0; i < r; i++) {
            map[i] = sc.nextLine().toCharArray();

        }
        String s= sc.next();
        int sum=0;
        for(int i=0; i<s.length();i++){
            sum++;
        }

        for(int i=0;i<r; i++){
            sw=0;
            back(i,0);
        }
        System.out.println(dab);
    }
}
