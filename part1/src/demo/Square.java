package demo;
import java.util.*;

public class Square {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int min = Integer.MAX_VALUE; 
        for(int i = 1; i <= Math.sqrt(target); i++) { 
            min = Math.min(min, square(target, i)); 
        }
        System.out.println(min);
    }
    
    public static int square(int target, int i) {
        int sum = 0;
        int j = 0;
        while (sum < target) {
            j++;
            sum += i * i;
        }
        if (sum == target) {
            return j;
        } else {
            return Integer.MAX_VALUE; 
        }
    }
}
