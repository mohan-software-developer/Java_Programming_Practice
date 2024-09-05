package Date23;
import java.util.*;

public class p1 {
	public static int factorial(int num)
	{   int fact = 1;
		for(int i=1;i<=num;i++)
		{
			fact = fact * i;
		}
		return fact;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("no of coins flipped:");
		int n = sc.nextInt();
		System.out.println("no of head: ");
		int r = sc.nextInt();
		if(r> n)
			{System.out.println("0.0");
			return ;
			}
		double coeff = factorial(n)/factorial(r)*factorial(n-r);
		double result = coeff * Math.pow(0.5,n);
		System.out.println(result);

	}

}
