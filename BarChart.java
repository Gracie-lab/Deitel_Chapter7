public class BarChart {
    void barChart(){
        int[] mark = {95,97,87,92,85};
        int[] frequency = {3,1,7,2,5};
        for(int i = 0; i<frequency.length; i++){
            int numberOccured = frequency[1];
            System.out.println(mark[i]+ ": ");
            for(int j = 0; j< numberOccured; j++){
                System.out.println("*");
            }
            System.out.println();
        }
    }
}
