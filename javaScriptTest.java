import java.util.Arrays;
import java.util.Scanner;
  public class javaScriptTest {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	int sum = 0;
	int[] numbers = new int[5];
	for(int count = 0;count < 5;count++) {
		System.out.println("Enter Input");
		int number = scan.nextInt();
		sum += number;
		numbers[count] = number;
	}
	int[] output = new int[5];
	for(int count = 0;count < 5;count++) {
		output[count] = sum - numbers[count];
	}
	System.out.print(Arrays.toString(output));

   }



}