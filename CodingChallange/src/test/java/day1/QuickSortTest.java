package day1;

import day1.MergeSort;
import day1.QuickSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuickSortTest {
    @Test
    public void testQuickSort(){
        int [] arr = {5,7,2,3,4};
        QuickSort.quickSort(arr, 0, arr.length-1);
        Assertions.assertArrayEquals(new int[]{ 2, 3, 4, 5, 7}, arr);
    }

    @Test
    public void testQuickSort1() {
        int [] arr = {5,7,2,3,4,1};
        QuickSort.quickSort(arr, 0, arr.length-1);
        Assertions.assertArrayEquals(new int[]{ 1,2, 3, 4, 5, 7}, arr);
    }
}
