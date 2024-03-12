package day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BucketSort {

    public static void sort(int []arr) {
        int noOfBuckets = 10;

        double maxElement = Arrays.stream(arr).max().orElse(0);
        double minElement = Arrays.stream(arr).min().orElse(0);
        double divider = (maxElement - minElement)/noOfBuckets;

        List<Integer> [] buckets = new List[noOfBuckets];
        for(int i=0; i< buckets.length ; i++){
            buckets[i] = new ArrayList<>();
        }

        for(int i=0 ;i< arr.length ;i++){
            int index = (int)Math.floor((arr[i] - minElement)/divider);
            //int index = arr[i] % noOfBuckets;
            if(index >= noOfBuckets) {
                index = noOfBuckets - 1;
            }
            buckets[index].add(arr[i]);
        }

        for(int i=0; i< buckets.length ; i++){
            Collections.sort(buckets[i]);
        }
       int index = 0;
        for(List<Integer> bucket : buckets){
            for(Integer element : bucket){
                arr[index++] = element;
            }
        }
    }

}
