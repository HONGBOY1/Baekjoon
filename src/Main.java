import java.math.BigInteger;
import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt(), b=sc.nextInt();
        int max= sc.nextInt();
        int sum=a+b;
        if(sum > max){
            if(sum >= max*2){
                System.out.println(sum-(max*2));
            }
            else{
                System.out.println(sum);
            }
        }
        else{
            System.out.println(sum);
        }

    }
}