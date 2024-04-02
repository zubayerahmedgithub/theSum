import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter an integer: ");
        int number = sc.nextInt();

        int sum = 0;
        int product = 1;
        int originalNumber = Math.abs(number); // this is to deal with negative numbers

        while (originalNumber!= 0) {
            int digit = originalNumber % 10;
            sum += digit;
            product *= digit;
            originalNumber /= 10;

        }
        System.out.println("Sum of digits : " + sum);
        System.out.println("Product : " + product);
}
}

