package day3;

import day2.BubbleSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountingSortTest {
    @Test
    public void testCountingSort1() {
        int [] arr = {5,7,2,3,4,1,5,5,7,1,1};
        CountingSort.sort(arr);
        Assertions.assertArrayEquals(new int[]{ 1,1,1,2,3,4,5,5,5,7,7}, arr);
    }
}
