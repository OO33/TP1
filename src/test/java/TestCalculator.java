import org.junit.Assert;
import org.junit.Test;

public class TestCalculator
{

    @Test
    public void test1plus1()
    {
        // Arrange = Organiser
        int arg1 = 1;
        int arg2 = 1;
        int expectedResult = 2;

        // Act = Action
        int returnResult = Calculator.add(1,1);

        // Assert = Verifier
        Assert.assertEquals(expectedResult, returnResult);
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void testMax()
    {
        // Arrange = Organiser
        int arg1 = Integer.MAX_VALUE;
        int arg2 = 1;

        // Act = Action
        int returnResult = Calculator.add(arg1,arg2);
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void testMin()
    {
        // Arrange = Organiser
        int arg1 = Integer.MIN_VALUE;
        int arg2 = -1;

        // Act = Action
        int returnResult = Calculator.add(arg1,arg2);
    }
}
