import java.util.Scanner;
import java.util.Arrays;
public class arrayPlay {
    public static void main(String... args) {
        Scanner input = new Scanner(System.in);
        int[][] t = new int[2][3];
//    expression for all the elements in row 1
        int elementRow1 = t[0][0];
        int elementRow2 = t[0][1];
        int elementRow3 = t[0][2];
//    expressions for all the elements in column 2
        int elementCol1 = t[0][1];
        int elementCol2 = t[1][1];
//    set element of t in row 0 and column 1 to zero

        t[0][1] = 0;
        t[0][0] = 0;
        t[0][2] = 0;
        t[1][0] = 0;
        t[1][1] = 0;
        t[1][2] = 0;
//use for loop to initialize all elements to zero
//    for(int row = 0; row <t.length; row++){
//        for(int col = 0; col<t[row].length; col++){
//            t[row][col] = 0;
//            System.out.print(t[row][col]+ " ");
//        }
//        System.out.println();
//    }


//        use for loop to input values in the array
//    for(int row = 0; row <t.length; row++){
//        for(int col = 0; col<t[row].length; col++){
//            System.out.print("Enter number : ");
//            int value = input.nextInt();
//            t[row][col] = value;
//        }
//    }
//        for(int row = 0; row <t.length; row++){
//            for(int col = 0; col<t[row].length; col++){
//            System.out.print(t[row][col]+ " ");
//            }
//        System.out.println();
//        }

//        display elements of the first row of array
//        System.out.printf("%d%3d%3d%n", t[0][0], t[0][1], t[0][2]);
//
//        int total = t[0][2] + t[1][2];
//        System.out.println(total);

        //        display the smallest value of array
        int smallest = t[0][0];
        for(int i = 0; i<t.length; i++){
            for(int j = 0; j<t[i].length; j++){
                if(t[i][j] < smallest){
                    smallest = t[i][j];
                }
            }
        }
        System.out.println(smallest);

//        display elements showing the indices
//        int rowCount = 0;
//        int colCount = 0;
//        for(int row = 0; row <t.length; row++){
//            for(int col = 0; col<t[row].length; col++){
//                System.out.println(rowCount);
//                System.out.print(colCount+ " ");
//                System.out.print(t[row][col]+ " ");
//            }
//            rowCount++;
//            colCount++;
//            System.out.println();
//        }
    }
}
