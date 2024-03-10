package day1;

import day1.BinaryToNumber;
import day1.NumberToBinary;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberToBinaryTest {


        @Test
        public void testNumberToBinary() {
            Assertions.assertEquals(101, NumberToBinary.printNumberToBinary(5));
        }

        @Test
        public void testNumberToBinary2() {
            Assertions.assertEquals(110, NumberToBinary.printNumberToBinary(6));
        }
}
