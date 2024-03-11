package day3;

import java.util.Arrays;

public class CountingSort {

    public static void sort(int[] arr){
        int n = arr.length;
        int max = Arrays.stream(arr).max().getAsInt();

        int []countArr = new int[n];
        for(int i=0; i<n; i++) {
            countArr[arr[i]]++;
        }

        for(int i=1; i<countArr.length; i++) {
            countArr[i] += countArr[i-1];
        }

        int []sortedArr = new int[n];
        for(int i = n-1; i>=0; i--) {
            sortedArr[countArr[arr[i]]-1] = arr[i];
            --countArr[arr[i]];
        }

        for(int i=0; i<n; i++){
            arr[i] = sortedArr[i];
        }
    }
}
