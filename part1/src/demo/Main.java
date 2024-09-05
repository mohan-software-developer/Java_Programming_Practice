package demo;
import java.util.*;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int num = sc.nextInt();
	for(int i=0;i<5;i++)
	 { int result = num + check(num);
	   System.out.println(result);
	   break;
	 }
	}
	
	public static int check(int num )
		{
			int temp = num;
			int mod;
			int rev = 0;
			while(temp!=0)
			{
			  mod = temp%10;
			  rev = (rev*10)+mod;
			  temp /= 10;
			}
			
		  return rev;
		}
	
	
	

}
