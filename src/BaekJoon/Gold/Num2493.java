package BaekJoon.Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;
class Info {
    int height;
    int index;
    Info(int height, int index) {
        this.height = height;
        this.index = index;
    }
}
public class Num2493 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        Stack<Info> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int arr[] = new int [n];
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s, " ");
        for(int i=0; i<n; i++){
            arr[i]= Integer.parseInt(st.nextToken());
            while(!stack.isEmpty() && stack.peek().height < arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                System.out.print("0 ");
            }
            else{
                System.out.print(stack.peek().index +" ");
            }
            stack.push(new Info(arr[i],i+1));
        }

    }


}
