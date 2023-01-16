package BaekJoon.Silver;

public class Num4673 {
    public static void main(String[] args) {
            int chk[]= new int[10002];
            for(int i=1; i<10000; i++){
            String[] arr = Integer.toString(i).split("");
            int num = 0;
            if(i < 10){
                num = i + Integer.parseInt(arr[0]);
            }
            else if(i < 100 && i >=10){
                num = i + Integer.parseInt(arr[0])+Integer.parseInt(arr[1]);
            }
            else if(i < 1000 && i >= 100){
                num = i + Integer.parseInt(arr[0])+Integer.parseInt(arr[1])+Integer.parseInt(arr[2]);
            }
            else if(i < 10000 && i >= 1000){
                num = i + Integer.parseInt(arr[0])+Integer.parseInt(arr[1])+Integer.parseInt(arr[2])+Integer.parseInt(arr[3]);
            }
            if(num < 10000) {
                chk[num]++;
            }
        }
            for (int i=1; i<10000;i++){
                if(chk[i]==0) System.out.println(i);
        }
    }
}
