package BaekJoon.Silver;
import java.util.Scanner;

public class Num9996 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        String a=sc.next();
        String b[] = a.split("\\*");

        for(int i=0; i<n; i++){
            String str = sc.next();
            String st[] = new String[2];
            if(b[0].length()+b[1].length()>str.length()) {
                System.out.println("NE");
                continue;
            }
            String front = str.substring(0, b[0].length());	//파일이름 앞부분
            String back = str.substring(str.length()-b[1].length(), str.length());	//파일이름 뒷부분

            if(front.equals(b[0]) && back.equals(b[1])){
                System.out.println("DA");
            }
            else{
                System.out.println("NE");
            }

        }
    }
}
