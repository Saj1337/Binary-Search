import java.util.Scanner;
public class factorialOfCapturedNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int j=1;	
		
		System.out.println("Enter a number: ");			
		int input = sc.nextInt();
		sc.close();
		
		for (int i = 2; i <= input; i++){
			j=j*i;
			}
		System.out.println("The factorial of " + input + " is: " + j);
	}
}