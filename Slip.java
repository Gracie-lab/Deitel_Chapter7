import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class Slip {
    private int salesPersonNumber;
    private int productNum;
    private int totalValue;
    Slip[] slips  =  new Slip[20];
    int[][] sales = new int[5][4];

    public Slip(){

    }

    public Slip( int salesPersonNumber, int productNum, int totalValue){
        this.salesPersonNumber = salesPersonNumber;
        this.productNum = productNum;
        this.totalValue = totalValue;
    }


    public int getSalesPersonNumber() {
        return salesPersonNumber;
    }

    public void setSalesPersonNumber(int salesPersonNumber) {
        this.salesPersonNumber = salesPersonNumber;
    }

    public int getProductNum() {
        return productNum;
    }

    public void setProductNum(int productNum) {
        this.productNum = productNum;
    }

    public int getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(int totalValue) {
        this.totalValue = totalValue;
    }


    public void generateSlips(){
        Random random = new Random();
        int[][] sales = new int[5][4];
        for(int i = 0; i < slips.length; i++) {
            int prodNum = 1 + random.nextInt(5);
            int personNum = 1 + random.nextInt(4);
            int value = 1 + random.nextInt(20);
            slips[i] = new Slip(personNum, prodNum, value);
        }

    }

    public void processSlips(){
        for(int prod = 0; prod < sales.length; prod++){
            for(int person = 0; person < sales[prod].length; person++){
                for(int slip = 0; slip < slips.length; slip++){
                    if(slips[slip].getProductNum() == prod && slips[slip].getSalesPersonNumber() == person){
                        sales[prod][person] += slips[slip].getTotalValue();
                    }
                }
            }
        }
    }

    public void printArraySales(){
        System.out.printf("%30s%22s%n", "Sales person number", "Total");
        String[] word = {" ", " ", "P", "N", " "};
        int[] productNums = {1,2,3,4,5};
        int track = 0;
        int total = 0;
        //print sales person numbers 1-4
        for(int i = 1; i < 5; i ++){
            System.out.printf("%10d", i);
        }
        System.out.println();
        System.out.println();
        for(int i = 0; i < sales.length; i++){
            if(track < word.length){
                System.out.print(word[track]+ "  ");
            }

            //print product numbers 1-5
            if(track < productNums.length){
                System.out.print(productNums[track]);
                track++;

                for(int j = 0; j < sales[i].length; j++){
                    System.out.printf(" %8d", sales[i][j]);
                    total += sales[i][j];

                }
            }
            System.out.printf(" %10d",total);
            total = 0;
            System.out.println();
        }
        int colTotal = 0;
        System.out.print("Total");
        for(int col = 0; col < sales[sales.length-1].length; col++){
            for(int row = 0; row < sales[col].length+1; row++){
                colTotal += sales[row][col];
//                System.out.println(sales[row][col]);
            }
            System.out.printf("%9d",colTotal);
            colTotal = 0;
        }
    }
}


