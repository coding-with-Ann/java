package Recursion;

class ComplexFunction {
	
	int calcFactorial(int n)
	{
		if(n==1)
			return 1;
		return(n * calcFactorial(n-1));
	}
	

}
