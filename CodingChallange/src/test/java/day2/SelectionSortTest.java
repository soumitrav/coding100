package day2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SelectionSortTest {

    @Test
    public void testBubbleSort(){
        int [] arr = {5,7,2,3,4};
        SelectionSort.sort(arr);
        Assertions.assertArrayEquals(new int[]{ 2, 3, 4, 5, 7}, arr);
    }

    @Test
    public void testSelectionSort1() {
        int [] arr = {5,7,2,3,4,1};
        SelectionSort.sort(arr);
        Assertions.assertArrayEquals(new int[]{ 1,2, 3, 4, 5, 7}, arr);
    }
}
