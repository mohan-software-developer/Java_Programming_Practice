package Date23;
import java.util.*;

public class wordcount {

    public static boolean wordCheck(String s, String[] arr) {
        boolean[] dp = new boolean[s.length() + 1];
        Set<String> set = new HashSet<>(Arrays.asList(arr));
        dp[0] = true;  

        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && set.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;  
                }
            }
        }

        return dp[s.length()];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] dictionary = { "i", "like", "sam", "sung", "samsung", "mobile", "ice", "cream", "icecream", "man", "go", "mango" };
        String input = sc.nextLine();
        System.out.println(wordCheck(input, dictionary) ? "YES" : "NO");
        sc.close();
    }
}
