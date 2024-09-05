package demo;
import java.util.*;
public class Substring {

	public static void main(String[] args) {
	   
     Scanner sc = new Scanner(System.in);
     String s1 = sc.nextLine();
     String s2 = sc.nextLine();
     int result = iSsubstring(s1,s2);
     System.out.println(result);
	}
	public static int iSsubstring(String s1,String s2)
	{
		int len1 = s1.length();
		int len2 = s2.length();
		for(int i =0;i<len1-len2;i++)
		{  int j;
			for( j=0;j<len2;j++)
			{
				if(s1.charAt(i+j)!=s2.charAt(j))
					break;
				
			}
			if(j == len2)
				return i;
		}
		return -1;
	}
	
}
