import java.util.Scanner;


public class ArrayDuplicate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[]  numbers = new int [5];
        int counter  = 1;
        int response;
        System.out.print("Enter a unique number: ");

        while (counter <= 5) {
            response = input.nextInt();

            if (response < 10 || response > 100 ) {
                System.out.print("Please enter a number between 10 and 100: ");
                continue;
            }

            for (int i = 0; i < numbers.length; i++) {
                if (response == numbers[i]) break;
                if (response != numbers[i] && numbers[i] == 0) {
                    numbers[i] = response;
                    counter++;
                    for (int number : numbers) {
                        if (number != 0) {
                            System.out.print(number + " ");
                        }
                    }

                    System.out.println();
                    break;
                }
            }
            if (counter < 6) System.out.print("Enter another unique number: ");
        }
    }
}
