package Date23;
import java.util.*;
public class largecommonprefix {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		String s = sc.nextLine();
		String temp[] = s.split(" ");
		int min = Integer.MAX_VALUE;
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i<temp.length;i++)
		{
			if(temp[i].length()<min)
			{
				sb.setLength(0);
				min = temp[i].length();
				sb.append(temp[i]);
				
			}
		}
		
		StringBuilder check = new StringBuilder();
		int flag = 0;
		for(int i=0;i<min;i++)
		{
			for(int j=0;j<temp.length;j++)
			{
				if(temp[j].charAt(i)!=sb.charAt(i)) {
					flag = 1;
					break;
				}
				
			}
			
			if(flag == 0)
				check.append(sb.charAt(i));
			else 
				break;
				
			
		}
		System.out.println(check);
		
	}

}
