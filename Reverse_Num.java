java.util.Scanner;

public class ReverseNumber {
    public static void main(String_example[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int reversedNumber = reverseNumber(n);
        System.out.println("Reversed number: " + reversedNumber);
    }

    public static int reverseNumber(int n) {
        int reversed = 0;
        while (n > 0) {
            reversed = (reversed * 10) + (n % 10);
        }
        return reversed;
    }
}

// 3 errors are present in this code
