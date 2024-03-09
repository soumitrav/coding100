import day1.BinarySearch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinarySearchTest {

    @Test
    public void testBinarySearch(){
        int []arr = {1,5,7,9,10};
        int index = BinarySearch.binarySearch(arr, 5, 0, arr.length);
        Assertions.assertEquals(1, index);
    }

    @Test
    public void testBinarySearch1(){
        int []arr = {1,5,7,9,10};
        int index = BinarySearch.binarySearch(arr, 9, 0, arr.length);
        Assertions.assertEquals(3, index);
    }

    @Test
    public void testBinarySearch2() {
        int []arr = {1,5,7,9,10};
        int index = BinarySearch.binarySearch(arr, 10, 0, arr.length);
        Assertions.assertEquals(4, index);
    }

    @Test
    public void testBinarySearch3() {
        int []arr = {1,5,7,9,10};
        int index = BinarySearch.binarySearch(arr, 11, 0, arr.length-1);
        Assertions.assertEquals(-1, index);
    }

    @Test
    public void testBinarySearchIterative(){
        int []arr = {1,5,7,9,10};
        int index = BinarySearch.binarySearch(arr, 5, 0, arr.length);
        Assertions.assertEquals(1, index);
    }

    @Test
    public void testBinarySearchIterative1(){
        int []arr = {1,5,7,9,10};
        int index = BinarySearch.binarySearch(arr, 9, 0, arr.length);
        Assertions.assertEquals(3, index);
    }

    @Test
    public void testBinarySearchIterative2() {
        int []arr = {1,5,7,9,10};
        int index = BinarySearch.binarySearch(arr, 10, 0, arr.length);
        Assertions.assertEquals(4, index);
    }

    @Test
    public void testBinarySearchIterative3() {
        int []arr = {1,5,7,9,10};
        int index = BinarySearch.binarySearch(arr, 11, 0, arr.length-1);
        Assertions.assertEquals(-1, index);
    }
}
