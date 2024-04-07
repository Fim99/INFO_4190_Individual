import org.junit.*;

public class Calculator_Test 
{
    // --- MULTIPLICATION TESTING ---
    @Test
    public void check_8_multiply_by_6_equals_48()
    {
        Calculator calcultor_test = new Calculator();
        Assert.assertEquals(48, calcultor_test.multiply(8, 6), 0.0001);
    }

    @Test
    public void check_2_multiply_by_2_equals_4()
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

    // --- DIVISION TESTING ---
    @Test
    public void check_8_divide_by_2_equals_4() 
    {
        Calculator calculator_test = new Calculator();
        Assert.assertEquals(4, calculator_test.divide(8, 2), 0.0001);
    }

    @Test
    public void check_2_divide_by_2_equals_1() 
    {
        Calculator calculator_test = new Calculator();
        Assert.assertEquals(1, calculator_test.divide(2, 2), 0.0001);
    }

    @Test
    public void check_divide_by_zero() 
    {
        Calculator calculator_test = new Calculator();
        // Dividing by zero results in infinity in Java
        Assert.assertEquals(Double.POSITIVE_INFINITY, calculator_test.divide(8, 0), 0.0001);
    }

    @Test
    public void check_divide_by_negative() 
    {
        Calculator calculator_test = new Calculator();
        Assert.assertEquals(-3, calculator_test.divide(6, -2), 0.0001);
    }
}
