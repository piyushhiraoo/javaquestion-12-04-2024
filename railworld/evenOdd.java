package railworld;

import java.util.Scanner;

public class evenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number to check :");
		int number = sc.nextInt();
		if(number%2==0) {
			System.out.println(number +" is Even number ");
		}else {
			System.out.println(number + " is Odd number ");
		}
	}

}
