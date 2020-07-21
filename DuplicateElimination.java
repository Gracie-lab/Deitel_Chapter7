import java.util.Arrays;
import java.util.Scanner;

public class DuplicateElimination {
    public static void main(String... args){

    Scanner input = new Scanner(System.in);
    int[] numbers = new int[5];
        System.out.println("enter number between 10 and 100");
    int num = input.nextInt();
    int count = 1;

//    select index of the array to assign input to
        while(count<=5){
        for(int counter = 0; counter< numbers.length; counter++){

//            search the array
//            for(int search = 0; search == 0; search++){
//                compare each element with input(num)
                if(numbers[count] > 0 && numbers[count] == num){
                    System.out.println("Number exists already, please enter a unique number: ");
//                    System.out.println("Enter number between 10 and 100");
                    num = input.nextInt();
                    continue;
                }
                if(numbers[count] != num && numbers[count] == 0){
                    numbers[counter] = num;
                    count++;
                    break;
                }

                for (int number : numbers) System.out.print(number + " ");
            }
            if(count<=5) {
                System.out.println("Enter number between 10 and 100");
            num = input.nextInt();
            }
//           Arrays.sort(numbers);
       }
    }
//        for(int values : numbers){
//        System.out.print("  "+values);
    }




