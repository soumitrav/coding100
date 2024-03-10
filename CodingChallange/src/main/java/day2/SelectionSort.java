package day2;

public class SelectionSort {
    public static void sort(int []arr) {
        int n = arr.length;
        for(int i=0; i< n-1; i++){
            int minxIndex = i;
            for(int j = i+1; j< n; j++) {
                if(arr[j] < arr[minxIndex]) {
                    minxIndex = j;
                }
            }
            //Swap the numbers
            arr[i] = arr[i] ^ arr[minxIndex];
            arr[minxIndex] = arr[i] ^ arr[minxIndex];;
            arr[i] = arr[i] ^ arr[minxIndex];
        }
    }
}
