import org.junit.*;

public class Calculator_Test 
{
    @Test
    public void check_8x6_equals_48()
    {
        Calculator calcultor_test = new Calculator();
        Assert.assertEquals(48, calcultor_test.multiply(8, 6), 0.0001);
    }

    @Test
    public void check_2x2_equals_4()
    {
        Calculator calcultor_test = new Calculator();
        Assert.assertEquals(4, calcultor_test.multiply(2, 2), 0.0001);
    }
    @Test
    
    public void check_multiply_by_zero() 
    {
        Calculator calculator_test = new Calculator();
        Assert.assertEquals(0, calculator_test.multiply(8, 0), 0.0001);
    }

    @Test
    public void check_multiply_by_negative() 
    {
        Calculator calculator_test = new Calculator();
        Assert.assertEquals(-6, calculator_test.multiply(2, -3), 0.0001);
    }
}
