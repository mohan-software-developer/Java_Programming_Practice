package Date23;
import java.util.*;
public class ascedning {
	public static void bubble(int arr[], int n)
	{
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{ if(arr[j]>arr[j+1])
				{int temp = arr[j];
			      arr[j] = arr[j+1];
			      arr[j+1] = temp;}
			}
			
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
        	arr[i] = sc.nextInt();
        	
        }
        int e=0;
        int o=0;
        for(int i=0;i<n;i++)
        {
        	if(arr[i]%2==0)
        		e++;
        	else
        		o++;
        }
        int[] arr1 = new int[e];
        int[] arr2 = new int[o];
        int k=0;
        int l=0;
        for(int i=0;i<n;i++)
        {
        	if(arr[i]%2==0)
        		arr1[k++] = arr[i];
        	else
        		arr2[l++] = arr[i];
        }
        bubble(arr1, arr1.length);
        
        bubble(arr2,arr2.length);
        int ll=0;
        int i;
        for(i=0;i<o;i++)
        	arr[ll++] = arr2[i];
        
        for(int j=arr1.length-1;j>=0;j--)
        	{arr[ll++] = arr1[j];
        	
        	}
        for( i=0;i<n;i++)
        {
        	System.out.print(arr[i]+ " ");
        }
	}

}
