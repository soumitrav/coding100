package day2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InsertionSortTest {

    @Test
    public void testInsertionSort(){
        int [] arr = {5,7,2,3,4};
        InsertionSort.sort(arr);
        Assertions.assertArrayEquals(new int[]{ 2, 3, 4, 5, 7}, arr);
    }

    @Test
    public void testSInsertionSort1() {
        int [] arr = {5,7,2,3,4,1};
        InsertionSort.sort(arr);
        Assertions.assertArrayEquals(new int[]{ 1,2, 3, 4, 5, 7}, arr);
    }
}
