package lab.saturday;

/**
Calculates the arithmetic operations
SaturdayLab1: Data types. Variables. Constants.Problem 3
Save file as Numbers.java
-- arithmetic operations with int and double operands (i.e. variables)
-- mixed addition
-- integer division. double division. mixed division */
public class Numbers {
	public static void main(String[] args) {
		String iRes;
		String dRes;
		iRes = "int result: ";
		dRes = "double result: ";
		
		//declare variable of type int
		int iNumOne, iNumTwo, iResult;
		
		//declare variable of type double
		double  dNumOne, dNumTwo, dResult;
		
		//assign/store
		iNumOne = 5;
		iNumTwo = 2;
		dNumOne = 10.0;
		dNumTwo = 11.5;
		
		//addition task
		iResult = iNumOne + (int) dNumOne;	//changing the double to integer
		dResult = dNumTwo + iNumOne;
		System.out.println(iRes + iResult);
		System.out.println(dRes + dResult);
		
		//multiplication task
		iResult = iNumOne * (int) dNumOne;
		dResult = dNumTwo * iNumOne;
		System.out.println(iRes + iResult);
		System.out.println(dRes + dResult);
		
		//division task
		iResult = iNumOne / (int) dNumOne;	//changing the double to integer
		dResult = dNumTwo / iNumOne;
		System.out.println(iRes + iResult);
		System.out.println(dRes + dResult);
		
		//subtraction task
		iResult = iNumOne - (int) dNumOne;	//changing the double to integer
		dResult = (double) (iNumOne - iNumTwo);
		System.out.println(iRes + iResult);
		System.out.println(dRes + dResult);
		
	}
}
