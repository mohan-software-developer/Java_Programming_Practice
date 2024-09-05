package Date23;
import java.util.*;
public class parenthesis {

	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String s = sc.nextLine();
       Stack<Character> st = new Stack<>();
       int i=0;
       while(i<s.length())
       {
    	   if(s.charAt(i) == '(')
    		   st.push(s.charAt(i));
    	   else if(s.charAt(i) == ')' && !st.isEmpty()&& st.peek() == '(')
    		   st.pop();
    	   
    	   i++;
       }
       if(st.size() == 0)
       {  System.out.println("0");
          return ;}
       System.out.println("1");

	}

}
