package BaekJoon.Bronze;

import java.util.Scanner;

public class Num1362 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt=0;
        while(true){
            String o=sc.next();
            String m=sc.next();
            if(o.equals("#")) break;
            while(true){
                String temp = sc.next();

                int a=Integer.parseInt(o);
                int b=Integer.parseInt(m);
                int num=0;
                if(temp.equals("#")) {
                    cnt++;
                    if(b > a/2 || b < a*2){
                        System.out.println(cnt+" :-)");
                    }
                    else if(b<=0){
                        System.out.println(cnt +" RIP");
                    }
                    else{
                        System.out.println(cnt +" :-(");
                    }
                    break;
                }
                else if(temp.equals("F")){
                    num=sc.nextInt();
                    b+=num;

                }
                else{
                    num=sc.nextInt();
                    b-=num;
                }
            }
        }
    }
}
