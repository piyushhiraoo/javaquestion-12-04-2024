package railworld;

import java.util.Scanner;

public class minMax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of Array :");
		int size = sc.nextInt();
		int[] arr = new int[size];
		int min =Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
	System.out.print("Enter array Element of Array :");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<size;i++) {
			if(arr[i]>max) max =arr[i];
			if(arr[i]< min) min = arr[i];
		}
		
		System.out.println("minimum : " + min + " "+ "maximum : " +max);
	}

}
