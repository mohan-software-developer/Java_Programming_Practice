package Date23;
import java.util.*;
public class split {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String s = sc.nextLine();
	    String[] m = s.split("\\.");
	    StringBuilder sb = new StringBuilder();
	    for(int i=m.length-1;i>0;i--)
	    {
	    	sb.append(m[i]);
	    	sb.append(".");
	    }
	    sb.append(m[0]);
	    System.out.println(sb.toString());

	}

}
