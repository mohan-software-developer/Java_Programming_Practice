package Date23;
import java.util.*;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] temp = s.split(" ");
        Set<Integer> inputSet = new HashSet<>();
        Set<Integer> fibSet = new HashSet<>();
        
        int max = -1;
        for (int i = 0; i < temp.length; i++) {  // Fix the loop condition
            int num = Integer.parseInt(temp[i]);
            inputSet.add(num);
            if (num > max) {
                max = num;
            }
        }

        int first = 0;
        int second = 1;
        while (first <= max) {
            fibSet.add(first);
            int next = first + second;
            first = second;
            second = next;
        }

        System.out.println("Fibonacci numbers within the input range:");
        for (Integer num : fibSet) {
            if (inputSet.contains(num)) {
                System.out.print(num + " ");
            }
        }
    }
}
