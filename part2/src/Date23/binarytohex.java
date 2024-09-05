package Date23;

import java.util.*;

public class binarytohex {

    // Function to convert binary to hexadecimal
    public static String binaryToHexadecimal(String binary) {
        // Convert binary to decimal
        int decimal = Integer.parseInt(binary, 2);
        // Convert decimal to hexadecimal
        String hexadecimal = Integer.toHexString(decimal).toUpperCase();
        return hexadecimal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] parts = input.split("\\.");

        // Extracting integer and fractional parts
        String integerPart = parts[0];
        String fractionalPart = parts.length > 1 ? parts[1] : "";

        // Convert integer part from binary to hexadecimal
        String hexadecimalIntegerPart = binaryToHexadecimal(integerPart);

        // Convert fractional part from binary to hexadecimal
        String hexadecimalFractionalPart = "";
        if (!fractionalPart.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            sb.append(".");
            for (int i = 0; i < fractionalPart.length(); i += 4) {
                String nibble = fractionalPart.substring(i, Math.min(i + 4, fractionalPart.length()));
                int decimalNibble = Integer.parseInt(nibble, 2);
                sb.append(Integer.toHexString(decimalNibble).toUpperCase());
            }
            hexadecimalFractionalPart = sb.toString();
        }

        // Output the result
        System.out.println(hexadecimalIntegerPart + hexadecimalFractionalPart);
    }
}
