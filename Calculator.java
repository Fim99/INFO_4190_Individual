public class Calculator 
{   
    // Method to perform multiplication
    public double multiply(double num_1, double num_2) 
    {
        return num_1 * num_2;
    }

    public static void main(String[] args) 
    {   
        // New Calculator Object
        Calculator calculator = new Calculator();
        
        // Values for multiplication calculator
        double mult_1 = 5;
        double mult_2 = 3;

        // Store method result in variable
        double result_1 = calculator.multiply(mult_1, mult_2);

        // Print Results
        System.out.println(mult_1 + " x " + mult_2 + " = " + result_1);
    }
}
