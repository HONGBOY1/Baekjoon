package BaekJoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Num11004 {
    /*퀵 솔트로 다시 풀어보기 */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        List<Integer> A = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
       for (int i = 0; i < N; i++) {
           A.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(A);
        System.out.println(A.get(K-1));
    }

    public static void quickSort(int[] arr){
        quickSort(arr, 0, arr.length-1);
    }
    public static void quickSort(int[] arr,int start,int end){
        if(start >= end)
            return;

        int pivot = start;
        int lo = start+1;
        int hi = end;

        while(lo < hi){
            while(lo < hi && arr[lo] < arr[pivot])
                lo++;
            while(lo < hi && arr[hi] > arr[pivot]);
                hi--;

            if(lo < hi){
                swap(arr,hi,lo);
            }
            if(lo > hi){
                swap(arr,lo,hi);
            }
        }
        quickSort(arr,start,hi-1);
        quickSort(arr,hi+1,end);
    }
    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
