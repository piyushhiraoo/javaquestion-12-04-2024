package railworld;
import java.util.HashSet;
import java.util.Scanner;
public class findDuplicates {

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
		findDuplicates(arr,size);

	}
	
	
//	public static void findDuplicates(int[] arr,int n) {
//		// First approach
//	System.out.println("Dublicates number are : ");
//		for(int i=0;i<n-1;i++) {
//			int number = arr[i];
//			for(int j=i+1;j<n;j++) {
//				if(number==arr[j]) {
//					System.out.print(number+" ");
//					break;
//				}
//			}
//		}
//	}
	
	public static void findDuplicates(int[] arr,int n) {
		// second Aprroach
		HashSet<Integer> set = new HashSet<>();
		System.out.println("Duplicates number are :");
		for(int i=0;i<n;i++) {
			if(set.contains(arr[i])) {
				System.out.print(arr[i]);
			}else {
				set.add(arr[i]);
			}
		}
	}
	
}

