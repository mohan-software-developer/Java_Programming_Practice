package Date23;
import java.util.*;
public class primenum {
	public static boolean prime(int num)
	{   
		if(num ==0 || num == 1)
			return false;
		for(int i=2;i<=num/2 ;i++)
		{
			if(num%i == 0)
				return false;
		}
		
		return true;
	}
	

	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int n = sc.nextInt();
	   int arr[] = new int[n];
	   for(int i=0;i<n;i++)
	   {
		   arr[i] = sc.nextInt();
	   }
	   
	   
	   for(int i=0;i<n;i++)
	   {
		   if(prime(arr[i]))
			   System.out.print(arr[i]+ " ");
	   }
	}

}
