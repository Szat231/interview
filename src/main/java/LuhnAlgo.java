import org.codehaus.plexus.util.StringUtils;

import java.util.Scanner;

public class LuhnAlgo {

    public static boolean checkLuhnAlgo(String digits) {
        Integer sum = 0;

        if (!StringUtils.isNumeric(digits) || StringUtils.isEmpty(digits)) {
            throw new IllegalArgumentException("Card number is invalid");
        }
        if (digits.length() < 15 || digits.length() > 17) {
            throw new IllegalArgumentException("Too short card number");
        }

        for (int i = digits.length() - 1; i >= 0; i--) {
            int number = Integer.parseInt(digits.substring(i, i + 1));
            if (i % 2 == 0) {
                number *= 2;
            }
            if (number > 9) {
                number -= 9;
            }
            sum += number;
        }
        if (sum % 10 == 0) {
            System.out.println(true);
            return true;
        } else {
            System.out.println(false);
            return false;
        }

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Input card number: ");

        String cardNumber = in.nextLine();

        checkLuhnAlgo(cardNumber);
    }

}
