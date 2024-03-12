package day4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BucketSortTest {
    @Test
    public void testBucketSort1() {
        int [] arr = {22, 45, 12, 8, 10, 6, 72, 81, 33, 18, 50, 14};
        BucketSort.sort(arr);
        Assertions.assertArrayEquals(new int[]{6,8,10, 12,14,18,22,33,45,50,72,81 }, arr);
    }
}
