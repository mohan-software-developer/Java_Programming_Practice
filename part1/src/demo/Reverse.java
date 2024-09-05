package demo;
import java.util.*;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList <Integer> list = new ArrayList<>();
		while(true)
		{
			int num = sc.nextInt();
			if(num == -1)
				break;
			list.add(num);
		}
		int arr[] = new int[list.size()];
		for(int i = 0;i<list.size();i++)
		{
			arr[i] = list.get(i);
		}
		
	    sortoddeven(arr);
	    for(int i =0;i<list.size();i++)
	    {System.out.print(arr[i]);}
		
	}
	public static void  sortoddeven(int arr[])
	{
		for(int i = 0;i<arr.length;i= i+2)
		{
			for(int j =i+2;j<arr.length;j=j+2 )
			{
				if(arr[i]<arr[j])
					{int temp = arr[i];
				     arr[i] = arr[j];
				     arr[j] = temp;}
			}
		}
		for(int i = 1;i<arr.length;i= i+2)
		{
			for(int j =i+2;j<arr.length;j=j+2 )
			{
				if(arr[i]>arr[j])
					{int temp = arr[i];
				     arr[i] = arr[j];
				     arr[j] = temp;}
			}
		}
	}

}
