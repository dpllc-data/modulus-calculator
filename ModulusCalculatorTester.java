/**
* This class instantiates a modulus caculator and tests its functionality
* @author Stan Shelton
* @version 1.0
*/
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class ModulusCalculatorTester
{
	/**
	* The main method queries the user and provides user menu
	* Determines which input method is called based on user selection 
	* Allows user to continue or exit on demand
	*/
	public static void main (String[]args)
	{
		
		//double number2 = 0;
		Scanner in = new Scanner(System.in);
		String select = "5";

		while ((select.equals("1")) || (select.equals("2")) || (select.equals("3")) || (select.equals("4")) || (select.equals("5")))
		{
		System.out.println("Welcome to the Great Modulo Calculator");
		System.out.println();
		System.out.println("What type of modulus calculation would you like to make?");
		System.out.println();
		System.out.println("*********************************************");
		System.out.println("* 1. Basic Modular Calculation              *");
		System.out.println("* 2. Modular Addition                       *");
		System.out.println("* 3. Modular Multiplication                 *");
		System.out.println("* 4. Modular Subtraction                    *");
		System.out.println("* 5. Exit the Program                       *");
		System.out.println("*********************************************");

		System.out.println("Please enter your selection...");
		select = in.next();

		if (select.equals("1"))
			input1();

		if ((select.equals("2")) || (select.equals("3")) || (select.equals("4")))
			input2(select);

		if (select.equals("5"))
			break;		
	}
			exit();		
}

	/**
	* input1() class method 
	* Accepts numeric input values to be calculated
	* Method instanitates basic modulus calculator
	* Method called and results printed System.out
	*/

	public static void input1()
	{
		Scanner in1 = new Scanner(System.in);

		System.out.println("Please input the 1st number...");
		double number1 = in1.nextDouble();
		
		System.out.println();
		
		System.out.println("Please input the 2nd number...");
		double number2 = in1.nextDouble();

		System.out.println();

		ModulusCalculator modulus = new ModulusCalculator( number1, number2);

		modulus.modArithmetic();

		System.out.println("The answer is " + modulus.getAnswer1());
		System.out.println();
		System.out.println("The expression: " + modulus.getExpression1());
		
		try {
    		TimeUnit.SECONDS.sleep(7);
			} 			
			catch (InterruptedException ie) 
			{
    			Thread.currentThread().interrupt();
    		}
    	System.out.println();
    	System.out.println();
    	System.out.println("-----------------------------------------------");
	}


	/**
	* input1() class method 
	* Accepts numeric input values to be calculated
	* Method instanitates appropriate modulus calculator (add, multiply, or subtract)
	* Method called and results printed System.out
	*/

	public static void input2(String selection)
	{
		Scanner in2 = new Scanner(System.in);

		System.out.println("Please input the 1st number...");
		double number1 = in2.nextDouble();
		
		System.out.println();
		
		System.out.println("Please input the 2nd number...");
		double number2 = in2.nextDouble();

		System.out.println();

		System.out.println("Please input the modulo value...");
		double number3 = in2.nextDouble();
		System.out.println();

		ModulusCalculator modulus = new ModulusCalculator(number1, number2, number3);

		if (selection.equals("2"))
			modulus.modAddition();
		if (selection.equals("3"))
			modulus.modMultiply();
		if (selection.equals("4"))
			modulus.modSubtract();

		System.out.println("The answer is " + modulus.getAnswer2());
		System.out.println();
		System.out.println("The expression: " + modulus.getExpression2());
		
		try 
		{
    		TimeUnit.SECONDS.sleep(7);
		} 			
			catch (InterruptedException ie) 
			{
    			Thread.currentThread().interrupt();
    		}
    	System.out.println();
    	System.out.println();
    	System.out.println("-----------------------------------------------");

	}

	/**
	* exit() method prints thank you to System.out
	* Method exits program
	*/		
	public static void exit()
	{
		System.out.println();
		System.out.println();
		System.out.println("----- ----- -----");
		System.out.println("Thank you for trying out the Great Modulo Calculator");
		System.out.println("Take care!");
		System.out.println("----- ----- -----");
	}
}