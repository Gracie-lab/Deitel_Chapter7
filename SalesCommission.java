package Example;
import java.util.Scanner;
public class SalesCommission {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [] counter = new int [9];
		String[] jargon = {"$200-299", "$300-399", "$400-499", "$500-599", "$600-699", "$700-799",
				"$800-899", "$900-999", "1000 above"};
		System.out.println("Enter salary: ");
		int salary = input.nextInt();
		
		while(salary >= 200) {
			int newSalary = salary / 100;
			
			
			switch(newSalary){
			case 2:
				counter[0]++;
				break;
			case 3:
				counter[1]++;
				break;
			case 4:
				counter[2]++;
				break;
			case 5:
				counter[3]++;
				break;
			case 6:
				counter[4]++;
				break;
			case 7:
				counter[5]++;
				break;
			case 8:
				counter[6]++;
				break;
			case 9:
				counter[7]++;
				break;
			case 10:
			default:
				counter[8]++;
				break;
			}
			System.out.println("Enter salary: ");
			salary = input.nextInt();
		}
		System.out.println("RANGE      FREQUENCY");

		for(int i = 0;i < counter.length;i++) {
			System.out.print(jargon[i] + ":     ");
			System.out.print(counter[i]);
			System.out.println();
		}
	}

}
