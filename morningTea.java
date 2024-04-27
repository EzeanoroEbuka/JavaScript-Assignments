import java.util.Scanner;
public class morningTea {
  public static void main(String[] args) {
	int[] input = {0,5,0,1,7};
	int maxFrequency = 0;
	for(int count = 0;count < 5;count++) {

		for(int i = 0;i < count;i++){
			if(input[i] == input[count])
			maxFrequency = input[i];
		}
		
	}
	System.out.print(maxFrequency);
}


}
	