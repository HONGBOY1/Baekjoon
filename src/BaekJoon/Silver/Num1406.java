package BaekJoon.Silver;

import java.io.*;
import java.util.ArrayList;
import java.util.Stack;

public class Num1406 {
    public static void main(String[] args) throws IOException {
        Stack<String> Lstack = new Stack<String>();
        Stack<String> Rstack = new Stack<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        String[] arr = str.split("");
        for (String st : arr){
            Lstack.push(st);
        }

        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            str = br.readLine();
            arr = str.split("");
            switch (arr[0]){
                case "P" :
                    Lstack.push(arr[2]);
                    break;
                case "L":
                    if(!Lstack.isEmpty())
                         Rstack.push(Lstack.pop());
                    break;
                case "B":
                    if(!Lstack.isEmpty())
                        Lstack.pop();
                    break;
                case "D":
                    if(!Rstack.isEmpty())
                        Lstack.push(Rstack.pop());
                    break;
                default:
                    break;
            }
        }
        while(!Lstack.isEmpty())
            Rstack.push(Lstack.pop());

        while(!Rstack.isEmpty())
            bw.write(Rstack.pop());

        bw.flush();
        bw.close();

    }
}
