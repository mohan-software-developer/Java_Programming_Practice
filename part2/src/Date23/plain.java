package Date23;
import java.util.*;

public class plain {
	public static int palin(int n)
	{   int temp = n;
	    int sum =0;
	   while(temp !=0)
	   {
		   int mod = temp%10;
		   sum = sum*10 + mod;
		   temp /= 10;
	   }
	   
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int nn = palin(n);
		for(int i=n;i<=nn;i++)
		{
			if(i == palin(i))
				System.out.println(i);
			return;
		}

	}

}
