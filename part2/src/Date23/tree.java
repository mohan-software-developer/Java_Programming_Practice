package Date23;
import java.util.*;
public class tree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] temp = s.split(" ");
		int first = Integer.parseInt(temp[0]);
		int second =Integer.parseInt(temp[1]);
		int third = Integer.parseInt(temp[2]);
        if(first == (second + third))
        	System.out.println("true");
        else
        	System.out.println("false");
	}

}
