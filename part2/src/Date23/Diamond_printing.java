package Date23;
import java.util.*;
public class Diamond_printing {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("num of line");
		int num = sc.nextInt();
		for(int i=0;i<num;i++)
		{
			for(int space =0;space<num-i-1;space++)
			{
				System.out.print(" ");
			}
			for(int j =0;j<=i;j++)
			{
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println("");
			
		}
		for(int i=0;i<num;i++)
		{
			for(int space =0;space<i;space++)
			{
				System.out.print(" ");
			}
			for(int j =num-1;j>=i;j--)
			{
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println("");
			
		}
		
		
	}

}
