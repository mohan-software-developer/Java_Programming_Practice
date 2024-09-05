package Date23;
import java.util.*;
public class plaindrome {
	public static boolean ispalindrome(String s)
	{   int l = 0;
	int r = s.length()-1;
	    while(l<r)
	    {
	    	if((s.charAt(l++) != (s.charAt(r--))))
	    		return true;
	    }
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] m = s.split(" ");
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<m.length;i++)
		{
			if((ispalindrome(m[i])))
				
			{
				sb.append(m[i]);
				sb.append(" ");
			}
				
		}
		
		System.out.println(sb.toString());
	}

}
