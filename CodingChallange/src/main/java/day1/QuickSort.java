package day1;

public class QuickSort {

    public static void main(String []args){

        int [] arr = {2,5,7,1,4,8};
        quickSort(arr, 0, arr.length-1);
    }

    public static void quickSort(int[] arr, int l, int r) {
        if( l<r){
            int pivot = partition(arr, l, r);
            quickSort(arr, l, pivot - 1);
            quickSort(arr, pivot + 1, r);
        }
    }

    private static int partition(int[] arr, int l, int r) {
        int pivot = arr[r];
        int i = l - 1;
        for(int j = l; j< r; j++){
            if(arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[r];
        arr[r] = temp;
        return i + 1;
    }
}
