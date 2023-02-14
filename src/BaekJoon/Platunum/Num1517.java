package BaekJoon.Platunum;

import java.io.*;
import java.util.StringTokenizer;


public class Num1517 {
    static long cnt=0;
    static int arr[];

    static int res[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n=Integer.parseInt(br.readLine());
        arr = new int[n];
        res = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        merge(0,n-1);
        bw.write(String.valueOf(cnt));
        bw.close();
        br.close();
    }
    static void merge(int left, int right){
        if(left < right){
            int mid = (left+ right)/2;

            merge(left,mid);
            merge(mid+1, right);
            mergeSort(left,right);
        }
    }
    static void mergeSort(int left, int right) {
        int mid = (left+ right)/2;
        int i = left;
        int j = mid + 1;
        int k = left;

        while (i <= mid && j <= right){
            if(arr[i] > arr[j]){
                res[k++] =arr[j++];
                cnt += (mid - i) +1;
            }
            else{
                res[k++] = arr[i++];
            }
        }

        if(i > mid){
            while (j <= right){
                res[k++] =arr[j++];
            }
        }
        else{
            while ( i <= mid){
                res[k++] = arr[i++];
            }
        }

        for (int l = left; l <= right ; l++) {
            arr[l]=res[l];
        }
    }
}

