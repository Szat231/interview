import java.util.Scanner;

public class ReversAndAdd {

    public static long revers(Long digits) {
        long reversedNumber = 0;

        for (; digits != 0; digits /= 10){
            long lastDigits = digits % 10;
            reversedNumber = reversedNumber * 10 + lastDigits;
        }
        return reversedNumber;
    }

    public static boolean chcekPalidrome(long palidrome) {
        return (revers(palidrome) == palidrome);
    }

    public static long reversAndAdd(long num) {
        long revNum = 0;
        int count = 0;

        while (num <= 4294967295l){
            revNum = revers(num);
            num = num + revNum;
            count++;
                if (chcekPalidrome(num)){
                    System.out.println("Final number: " + num + " Count of iterations: " + count);
                    return Long.parseLong(String.valueOf(num));
                } else if (num > 4294967295l){
                    System.out.println("No found palindrome, " + " Count of iterations: " + count);
                }
        }
        return Long.parseLong(String.valueOf(0));
    }
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        System.out.println("Give a number: ");

        long number = Long.parseLong(in.nextLine());

        reversAndAdd(number);

    }
}
