package Date23;
import java.util.*;
public class fingnum {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int m = n/3;
		int temp = (m-1) + m + (m+1);
		if(temp == n)
			System.out.println(m-1+" "+m+" "+(m+1));
		else 
			System.out.println("");
	}

}
