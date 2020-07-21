public class VariableLength{

    public static int product(int... numbers) {
        int product = 1;
        for (int num : numbers) {
            product *= num;

        }
        return product;
    }


    public static void main(String... args){
        System.out.println(product(1,2,3));
    }
}
