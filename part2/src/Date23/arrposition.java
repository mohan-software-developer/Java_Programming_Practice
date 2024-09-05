package Date23;
import java.util.*;
public class arrposition {
	public static void bubblesort(int arr[],int n)
	{
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;i++)
			{
				if(arr[j]<arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					}
			}
		}
	}
	public static void bubble(int arr[],int n)
	{
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;i++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					}
			}
		}
	}

	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   String s = sc.nextLine();
	   String[] temp = s.split(" ");
	   int arr[] = new int[temp.length];
	   for(int i=0;i<temp.length;i++)
	   {  int num = Integer.parseInt(temp[i]);
		   arr[i] = num;
	   }
	   int esize=temp.length%2 +1;
	   int osize = temp.length%2;
	   
	   int even[] = new int[esize];
	   int odd[]= new int[osize];
	   for(int i=0;i<temp.length;i++)
	   {
		   if(i%2 ==0)
			   even[i] = arr[i];
		   else
			   odd[i] = arr[i];
	   }
	   bubblesort(even,esize);
	   bubble(odd,osize);
       for(int i =0;i<temp.length;i++)
       {
    	   
       }
	}

}
