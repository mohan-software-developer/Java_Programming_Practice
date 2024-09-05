package Date23;
import java.util.*;
public class index {
	public static String remove (String s , char in)
	{
		StringBuilder sb = new StringBuilder();
		int i=0;
			while(s.charAt(i) != in)
				{sb.append(s.charAt(i));i++;}
		
			return sb.toString();
	}
	
	public static void check(String arr[], int n)
	{  
		String temp [] = new String[n];
		for(int i = 0;i<n;i++)
		{
			 for(int j=0;j<arr[i].length();j++)
			 {
				 if(arr[i].charAt(j)>='0' && arr[i].charAt(j)<='9')
				 {   
					 int m  = arr[i].charAt(j) - '0';
					 temp[m]=remove(arr[i],arr[i].charAt(j));
				 }
			 }
		}
		int i=0;
		while(i<temp.length)
		{System.out.print((temp[i])+" ");
		i++;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
	   System.out.println("string:");
		String s = sc.nextLine();
		String arr[] = s.split(" ");
		int n = arr.length;
		check(arr,n);
	}

}
