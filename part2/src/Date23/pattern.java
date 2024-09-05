package Date23;
import java.util.*;
public class pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n=sc.nextInt();
        sb.append("1");
          System.out.println("1");
        int count = 1;
        for(int i =2;i<=n;i++)
        {
        	String s = sb.toString();
        	sb.setLength(0);
        	count = 1;
        	for(int j=0;j<s.length()-1;j++)
        	{   
        		if(s.charAt(j)==s.charAt(j+1))
        			count++;
        		else {
        			sb.append(count);
        			sb.append(s.charAt(j));
        			
        			count=1;
        		}
        		
        	}
           	sb.append(count);
        	sb.append(s.charAt(s.length()-1));
     
        	System.out.println(sb);
        	
        }

	}

}
