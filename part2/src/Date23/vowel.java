package Date23;
import java.util.*;
public class vowel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("String:");
		String s = sc.nextLine();
		String n = "";
		int len = s.length() -1;
		if(!(s.charAt(0) == 'o' || s.charAt(0) == 'O' ||s.charAt(0) == 'a' || s.charAt(0) == 'A'||
				s.charAt(0) == 'e' || s.charAt(0) == 'E'||
				s.charAt(0) == 'i' || s.charAt(0) == 'I'||
				s.charAt(0) == 'U' || s.charAt(0) == 'u'))
			n += s.charAt(0);
		if((s.charAt(0) == 'o' || s.charAt(0) == 'O' ||s.charAt(0) == 'a' || s.charAt(0) == 'A'||
				s.charAt(0) == 'e' || s.charAt(0) == 'E'||
				s.charAt(0) == 'i' || s.charAt(0) == 'I'||
				s.charAt(0) == 'U' || s.charAt(0) == 'u'))
            {if( s.charAt(1) == 'o' ||s.charAt(1) == 'O' ||s.charAt(1)=='a' || s.charAt(1)=='A'||
					 s.charAt(1) =='e' || s.charAt(1) == 'E'||
				     s.charAt(1) == 'i'||s.charAt(1) == 'I'||
					 s.charAt(1) =='U'|| s.charAt(1) == 'u')
            	n += s.charAt(0);
                 }
		for(int i=1;i<s.length()-1;i++)
		{
			if(!(s.charAt(i) == 'o' || s.charAt(i) == 'O' ||s.charAt(i) == 'a' || s.charAt(i) == 'A'||
					s.charAt(i) == 'e' || s.charAt(i) == 'E'||
					s.charAt(i) == 'i' || s.charAt(i) == 'I'||
					s.charAt(i) == 'U' || s.charAt(i) == 'u'))
				n += s.charAt(i);
			if((s.charAt(i) == 'o' || s.charAt(i) == 'O' ||s.charAt(i) == 'a' || s.charAt(i) == 'A'||
					s.charAt(i) == 'e' || s.charAt(i) == 'E'||
					s.charAt(i) == 'i' || s.charAt(i) == 'I'||
					s.charAt(i) == 'U' || s.charAt(i) == 'u'))
                {if(s.charAt(i+1) == 'o' || s.charAt(i-1) == 'o'  || s.charAt(i+1) == 'O'||s.charAt(i-1) == 'O' ||s.charAt(i+1) == 'a'|| s.charAt(i-1)=='a' || s.charAt(i+1) == 'A'||s.charAt(i-1)=='A'||
					s.charAt(i+1) == 'e'|| s.charAt(i-1) =='e' || s.charAt(i+1) == 'E'|| s.charAt(i-1) == 'E'||
					s.charAt(i+1) == 'i'|| s.charAt(i-1) == 'i'|| s.charAt(i+1) == 'I'||s.charAt(i-1) == 'I'||
					s.charAt(i+1) == 'U' ||s.charAt(i-1) =='U'||s.charAt(i-1) == 'u' || s.charAt(i+1) == 'u')
                	n += s.charAt(i);
	                 }

        

		}
		if(!(s.charAt(len) == 'o' || s.charAt(len) == 'O' ||s.charAt(len) == 'a' || s.charAt(len) == 'A'||
				s.charAt(len) == 'e' || s.charAt(len) == 'E'||
				s.charAt(len) == 'i' || s.charAt(len) == 'I'||
				s.charAt(len) == 'U' || s.charAt(len) == 'u'))
			n += s.charAt(len);
		if((s.charAt(len) == 'o' || s.charAt(len) == 'O' ||s.charAt(len) == 'a' || s.charAt(len) == 'A'||
				s.charAt(len) == 'e' || s.charAt(len) == 'E'||
				s.charAt(len) == 'i' || s.charAt(len) == 'I'||
				s.charAt(len) == 'U' || s.charAt(len) == 'u'))
            {if( s.charAt(len-1) == 'o' ||s.charAt(len-1) == 'O' ||s.charAt(len-1)=='a' || s.charAt(len-1)=='A'||
					 s.charAt(len-1) =='e' || s.charAt(len-1) == 'E'||
				     s.charAt(len-1) == 'i'||s.charAt(len-1) == 'I'||
					 s.charAt(len-1) =='U'|| s.charAt(len-1) == 'u')
            	n += s.charAt(len);
                 }
		for(int i=0;i<n.length();i++)
		
		{
			System.out.print(n.charAt(i)+" ");
		}
	}
}

