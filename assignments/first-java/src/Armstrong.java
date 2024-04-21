import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println(number + (isArmstrong(number) ? " is an Armstrong number." : " is not an Armstrong number."));
    }

    public static boolean isArmstrong(int number) {
        int sum = 0, originalNumber = number, numDigits = (int) Math.log10(number) + 1;
        while (number > 0) {
            int digit = number % 10;
            sum += (int) Math.pow(digit, numDigits);
            number /= 10;
        }
        return sum == originalNumber;
    }
}
