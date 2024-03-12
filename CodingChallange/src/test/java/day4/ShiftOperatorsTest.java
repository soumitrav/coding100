package day4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShiftOperatorsTest {

    @Test
    public void leftShiftTest(){
        Assertions.assertEquals(16, ShiftOperators.leftShift(2, 3));
        Assertions.assertEquals(-32, ShiftOperators.leftShift(-4, 3));
    }

    @Test
    public void rightShiftTest(){
        Assertions.assertEquals(4, ShiftOperators.rightShift(32, 3));
        Assertions.assertEquals(8, ShiftOperators.rightShift(64, 3));
        Assertions.assertEquals(-8, ShiftOperators.rightShift(-64, 3));
    }

    @Test
    public void rightUnsignedShiftTest(){

        Assertions.assertEquals(-8, ShiftOperators.unsignedRightShift(-64, 3));
    }
}
