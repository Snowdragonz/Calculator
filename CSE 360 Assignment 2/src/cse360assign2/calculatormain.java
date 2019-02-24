package cse360assign2;
import java.util.Scanner;
public class calculatormain {

	public static void main(String[] args) 
	{
		
		Scanner scanner = new Scanner(System.in);
		Calculator calc = new Calculator();
		
		int number;
		
		number = scanner.nextInt();
		calc.add(number);
		
		number = scanner.nextInt();
		calc.subtract(number);
		
		number = scanner.nextInt();
		calc.multiply(number);
		
		number = scanner.nextInt();
		calc.add(number);
		
		System.out.println(calc.getTotal());
		System.out.println(calc.getHistory());
	}
}
