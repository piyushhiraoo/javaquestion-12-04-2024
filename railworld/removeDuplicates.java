package railworld;

import java.util.Scanner;

public class removeDuplicates {

	public static void printArray(int[] arr,int n) {
		System.out.println("Original Array :");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of Array :");
		int size = sc.nextInt();
		int[] arr = new int[size];
	System.out.print("Enter array Element of Array :");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		printArray(arr,size);
		removeDuplicates(arr,size);
	

	}
	
	public static void removeDuplicates(int[] arr,int n) {
		for(int i=0;i<n-1;i++) {
			int number =arr[i];
			for(int j=i+1;j<n;j++) {
				if(number==arr[j]) {
					arr[i]=-1;
					arr[j]=-1;
					break;
				}
			}
		}
		System.out.println("After Removing Duplicates :");
		for(int i=0;i<n;i++) {
			if(arr[i]>0)
			System.out.print(arr[i]+" ");
		}
	}

}
