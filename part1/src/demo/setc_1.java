package demo;
import java.util.*;

public class setc_1 {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	ArrayList <Integer> list = new ArrayList<>();
	while(true)
	{
	  int num = sc.nextInt();
	  if(num == -1)
		  break;
	  list.add(num);
	}
	int arr[]= new int [list.size()];
	int mul =1;
	for(int i =0;i<list.size();i++)
	{
		arr[i] = list.get(i);
		mul = mul * arr[i];
	}
	for(int i=0;i<arr.length;i++)
	{
		arr[i] = mul/arr[i];
	}
	for(int i =0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
	
	
	
   
	}

}
