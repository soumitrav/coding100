import day1.BinaryToNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinaryToNumberTest {

    @Test
    public void testBinaryToNumber(){
        Assertions.assertEquals(5, BinaryToNumber.convertBinaryToNumber(101));
    }

    @Test
    public void testBinaryToNumberAnother(){
        Assertions.assertEquals(6, BinaryToNumber.convertBinaryToNumber(110));
    }
}
