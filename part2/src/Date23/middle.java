package Date23;
import java.util.*;
public class middle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int len = s.length() - 1;
		StringBuilder sb = new StringBuilder();
		for(int i = len/2;i<len;i++)
		{
			System.out.println(sb.append(s.charAt(i)));
		}
		for(int i = 0;i<len/2;i++)
		{
			System.out.println(sb.append(s.charAt(i)));
		}
        System.out.println(sb);

	}

}
