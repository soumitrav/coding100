package day1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BinarySearch {

    public static int binarySearch(int []arr, int item, int left, int right) {
        if(right >= left) {
            int m = left + ((right - left) / 2);
            if (arr[m] == item)
                return m;
            if(arr[m] < item) {
                return binarySearch(arr, item, m+1, right);
            } else {
                return binarySearch(arr, item, left, m-1);
            }
        }
        return -1;
    }


    public static int binarySeachIterative(int []arr, int item, int left, int right){
        int mid = left + right/2;
        while(left <= right) {
            if(arr[mid] == item) {
                return mid;
            }
            if(arr[mid] < item) {
                left = mid+1;
            } else {
                right = mid -1;
            }
            mid = (left+right)/2;
        }
        return -1;
    }



}
