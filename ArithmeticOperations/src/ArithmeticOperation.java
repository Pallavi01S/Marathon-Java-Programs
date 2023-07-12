
public class ArithmeticOperation {
	public static void main(String[] args) {

		int subres= subtractNumbers(20, 5);
		int mulres=multiplyNumbers(4, 5);
		double divres=divideNumbers(20, 4);
		int remres=findRemainder(10, 3);
		System.out.println(subres);
		System.out.println(mulres);
		System.out.printf("%.2f\n",divres);
		System.out.println(remres);
	}
	public static int subtractNumbers(int num1, int num2)
	{
		return num1-num2;
	}
	public static int multiplyNumbers(int num1, int num2)
	{
		return num1*num2;
	}
	public static double divideNumbers(int num1, int num2)
	{
		return num1/num2;
	}
	public static int findRemainder(int num1, int num2)
	{
		return num1%num2;
	}
	

}



