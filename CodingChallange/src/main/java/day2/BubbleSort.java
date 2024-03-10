package day2;

public class BubbleSort {

    public static void sort(int [] arr) {
        int n = arr.length;
        for(int i=0; i< n; i++) {
            for(int j=0; j < n-1-i; j++) {
                if(arr[j] > arr[j+1]) {
                    arr[j] = arr[j] ^ arr[j+1];
                    arr[j+1] = arr[j] ^ arr[j+1];
                    arr[j] = arr[j] ^ arr[j+1];
                }
            }
        }
    }
}
