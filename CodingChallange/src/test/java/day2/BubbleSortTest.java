package day2;

import day1.MergeSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BubbleSortTest {

    @Test
    public void testBubbleSort(){
        int [] arr = {5,7,2,3,4};
        BubbleSort.sort(arr);
        Assertions.assertArrayEquals(new int[]{ 2, 3, 4, 5, 7}, arr);
    }

    @Test
    public void testBubbleSort1() {
        int [] arr = {5,7,2,3,4,1};
        BubbleSort.sort(arr);
        Assertions.assertArrayEquals(new int[]{ 1,2, 3, 4, 5, 7}, arr);
    }
}
