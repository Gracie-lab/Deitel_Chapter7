public class MultiArray {
    public static void main(String... args){
        int[][] multi ={{1, 2,3}, {4, 5, 6}, {8,9,1},{1,2,3} };
        for(int row = 0; row<multi.length; row++){
            for(int col = 0; col<multi[row].length; col++){
                    System.out.printf("%d  ", multi[row][col]);
            }
            System.out.println();
        }

    }
}
