public class Calculator 
{   
    // Method to perform multiplication
    public double multiply(double num_1, double num_2) 
    {
        return num_1 * num_2;
    }

    // Method to perform division
    public double divide(double num_1, double num_2) 
    {
        return num_1 / num_2;
    }

    public static void main(String[] args) 
    {   
        // New Calculator Object
        Calculator calculator = new Calculator();
        
        // --- MULTIPLICATION ---
        // Values for multiplication calculator
        double multiply_1 = 5;
        double multiply_2 = 3;

        // Store multiply method result in variable
        double result_multiply = calculator.multiply(multiply_1, multiply_2);

        // Print results for multiply
        System.out.println(multiply_1 + " x " + multiply_2 + " = " + result_multiply);

        // --- DIVISION ---
        // Values for division calculator
        double divide_1 = 10;
        double divide_2 = 2;

        // Store divide result in variable
        double result_divide = calculator.divide(divide_1, divide_2);

        // Print results for divide
        System.out.println(divide_1 + " / " + divide_2 + " = " + result_divide);
    }
}
