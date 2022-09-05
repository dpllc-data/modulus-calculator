/**
* This class represents the Modulus Calculator capable of 4 different calculations 
* Modular math has two attributes and a corresponding method
* Modular add, mult, and subt have three attributes and a corresponding method
* @author Stan Shelton
* @version 1.0
*/

public class ModulusCalculator
	{
	private double myNum1, myNum2;
	private double myNum3, myNum4, myNum5;
	private double answer1, answer2; 
	String expression1, expression2;

	/**
	* This constructor instantiates regular modulus calculator 
	* @param num1 the dividend 
	* @param num2 the divisor or mudolo
	* inits placeholder for answer
	* inits place holder for String representation of final expression
	*/
	public ModulusCalculator(double num1, double num2) 
	{
		myNum1 = num1;
		myNum2 = num2;
		answer1 = 0;
		expression1 = "";
	}

	/**
	* This constructor instantiates add, subt, or multi modular calculator 
	* @param num1 the first value 
	* @param num2 the second value
	* @param num3 the modulo value
	* inits placeholder for answer
	* inits place holder for String representation of final expression
	*/
	public ModulusCalculator(double num3, double num4, double num5) 
	{
		myNum3 = num3;
		myNum4 = num4;
		myNum5 = num5;
		answer2 = 0;
		expression2 = "";
	}

	/**
	* @return decimal value, 1st number input for modular math
	*/
	public double getNum1() 
	{
		return myNum1; 
	}

	/**
	* @return decimal value, 2nd number input for modular math
	*/
	public double getNum2() 
	{
		return myNum2; 
	}

	/**
	* @return decimal value, 1st number input mod add, mod subt, or mod multi 
	*/
	public double getNum3() 
	{
		return myNum3; 
  	}

	/**
	* @return decimal value, 2nd number input for mod add, mod subt, or mod multi 
	*/
  	public double getNum4() 
	{
		return myNum4;
  	} 

	/**
	* @return decimal value, 3rd number input for mod add, mod subt, or mod multi 
	*/
	public double getNum5() 
	{
		return myNum5; 
	}

	/**
	* @return decimal value answer to mod math calculation
	*/
	public double getAnswer1() 
	{
		return answer1; 
	}

	/**
	* @return decimal value answer to mod add, mod subt, or mod multi 
	*/
	public double getAnswer2() 
	{
		return answer2; 
	}

	/**
	* @return String represenation of expression for modular math
	*/
	public String getExpression1() 
	{
		return expression1; 
	}

	/**
	* @return String represenation of mod add, mod subt, or mod multi 
	*/
	public String getExpression2() 
	{
		return expression2; 
	}


	/**
	* @param num1 update 1st number input for modular math
	*/
	public void setNum1(double num1) 
	{
		 myNum1 = num1;
	}

	/**
	* @param num2 update 2nd number input for modular math
	*/
	public void setNum2(double num2) 
	{
		 myNum2 = num2;
	}

	/**
	* @param num3 update 1st number input mod add, mod subt, or mod multi
	*/
	public void setNum3(double num3) 
	{
		 myNum3 = num3;
	}

	/**
	* @param num4 update 2nd number input mod add, mod subt, or mod multi
	*/
	public void setNum4(double num4) 
	{
		 myNum4 = num4; 
	}

	/**
	* @param num5 update 3rd number input mod add, mod subt, or mod multi
	*/    		    		
	public void setNum5(double num5) 
	{
		 myNum5 = num5;
	}

	/**
	* @param ans1 update answer to modular math calculation
	*/
	public void setAnswer1(double ans1) 
	{
		answer1 = ans1; 
	}

	/**
	* @param ans2 update answer to mod add, mod subt, or mod multi calculation
	*/
	public void setAnswer2(double ans2) 
	{
		answer2 = ans2; 	System.out.println();
		System.out.println("You chose basic MODULAR MULTIPLICATION");
	}

	/**
	* @param exp1 update modular math expression (String)
	*/
	public void setExpression1(String exp1) 
	{
		expression1 = exp1; 
	}

	/**
	* @param exp2 update mod add, mod subt, or mod multi expression (String)
	*/
	public void setExpression2(String exp2) 
	{
		expression2 = exp2; 
	}


	/**
	* modArithmetic() instance method for mudular math calculator
	* Performs calculation for modular arithmetic
	* Creates String representaiton of mod math expression
	*/
	public void modArithmetic()
	{
		System.out.println();
		System.out.println("You chose basic MODULAR MATH");
		answer1 = myNum1 % myNum2;
		expression1 = (myNum1 + " % " + myNum2 + " = " + answer1);
	}

	/**
	* modAddition() instance method for mudular addition calculator
	* Performs calculation for modular addition arithmetic
	* Creates String representaiton of mod math expression
	*/
	public void modAddition()
	{
		System.out.println();
		System.out.println("You chose basic MODULAR ADDITION");
		answer2 = (myNum3 + myNum4) % myNum5;
		//expression2 = (myNum3 + " + " + myNum4 + " % " + myNum5 + " = " + answer2);
		expression2 = ("(" + myNum3 + " + " + myNum4 + ")" + " % " + myNum5 +  " = " + answer2);
	}

	/**
	* modMultiply() instance method for mudular mulitiplication calculator
	* Performs calculation for modular multiplication arithmetic
	* Creates String representaiton of mod math expression
	*/
	public void modMultiply()
	{
		System.out.println();
		System.out.println("You chose basic MODULAR MULTIPLICATION");
		answer2 = (myNum3 * myNum4) % myNum5;
		//expression2 = (myNum3 + " * " + myNum4 + " % " + myNum5 + " = " + answer2);
		expression2 = ("(" + myNum3 + " * " + myNum4 + ")" + " % " + myNum5 +  " = " + answer2);
	}

	/**
	* modSubtract() instance method for mudular subtraction calculator
	* Performs calculation for modular subtraction arithmetic
	* Creates String representaiton of mod math expression
	*/
	public void modSubtract()
	{
		System.out.println();
		System.out.println("You chose basic MODULAR SUBTRACTION");
		if (myNum3 >= myNum4)
		{
			answer1 = (myNum3 - myNum4) % myNum5;
			expression2 = ("(" + myNum3 + " - " + myNum4 + ")" + " % " + myNum5 + " = " + answer2);
		}
		else
			answer2 =  ((myNum3 + myNum5) - myNum4 ) % myNum5;
			expression2 = ("((" + myNum3 + " + " + myNum5 + ")" + " - " + myNum4 + ") " + " % " + myNum5 + " = " + answer2);
	}
	}