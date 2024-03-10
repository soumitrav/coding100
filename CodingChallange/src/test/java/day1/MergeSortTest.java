package day1;

import day1.MergeSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MergeSortTest {

    @Test
    public void testMergeSort(){
        int [] arr = {5,7,2,3,4};
        MergeSort.sort(arr, 0, arr.length-1);
        Assertions.assertArrayEquals(new int[]{ 2, 3, 4, 5, 7}, arr);
    }

    @Test
    public void testMergeSort1() {
        int [] arr = {5,7,2,3,4,1};
        MergeSort.sort(arr, 0, arr.length-1);
        Assertions.assertArrayEquals(new int[]{ 1,2, 3, 4, 5, 7}, arr);
    }
}
