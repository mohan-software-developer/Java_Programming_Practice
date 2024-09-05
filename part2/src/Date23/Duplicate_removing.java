package Date23;
import java.util.Scanner;

public class Duplicate_removing {
    
    public static String check(StringBuilder sb) {
        StringBuilder s2 = new StringBuilder();
        int i = 0;
        
        while (i < sb.length() - 1) {
            if (sb.charAt(i) != sb.charAt(i + 1)) {
                s2.append(sb.charAt(i));
                i++;
            } else {
               
                while (i < sb.length() - 1 && sb.charAt(i) == sb.charAt(i + 1)) {
                    i++;
                }
                i++; 
            }
        }
        
        
        if (i == sb.length() - 1) {
            s2.append(sb.charAt(i));
        }
        
        return s2.toString();
    }

    public static boolean dcheck(StringBuilder sb) {
        int i = 0;
        while (i < sb.length() - 1) {
            if (sb.charAt(i) == sb.charAt(i + 1)) {
                return true;
            }
            i++;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String s = sc.nextLine();
        
        if (s.length() == 0) {
            System.out.println("");
            return;
        }
        
        StringBuilder s2 = new StringBuilder(s);
        StringBuilder s3;
        
        do {
            s3 = new StringBuilder(check(s2));
            s2.setLength(0);
            s2.append(s3);
        } while (dcheck(s3));
        
        System.out.println(s3.toString());
    }
}
