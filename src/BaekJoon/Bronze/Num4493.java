package BaekJoon.Bronze;

import java.util.Scanner;

public class Num4493 {
        public static void main(String[] args) {
                String play1 , play2;
                int cnt,cnt2;
                int n,Rn;
                Scanner sc= new Scanner(System.in);
                n=sc.nextInt();

                cnt=0;cnt2=0;
                for(int i=0; i < n ;i++){
                        cnt=0;cnt2=0;
                        Rn=sc.nextInt();
                        for(int j=0; j < Rn; j++){
                                play1=""; play2="";
                                play1 = sc.next();
                                play2 = sc.next();
                                if(play1.equals("R")){
                                        if(play2.equals("S")){
                                                cnt++;
                                        }
                                        else if(play2.equals("P")){
                                                cnt2++;
                                        }
                                }
                                else if(play1.equals("S")){
                                        if(play2.equals("R")){
                                                cnt2++;
                                        }
                                        else if(play2.equals("P")){
                                                cnt++;
                                        }
                                }
                                else if(play1.equals("P")){
                                        if(play2.equals("S")){
                                                cnt2++;
                                        }
                                        else if(play2.equals("R")){
                                                cnt++;
                                        }
                                }
                        }

                        if(cnt > cnt2){
                                System.out.println("Player 1");
                        }
                        else if(cnt < cnt2){
                                System.out.println("Player 2");
                        }
                        else{
                                System.out.println("TIE");
                        }

                }

        }
}
