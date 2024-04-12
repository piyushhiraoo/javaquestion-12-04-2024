package railworld;

import java.util.Scanner;

public class vowelsAndConsonent {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name :");
		String str = sc.next();
		int vowels =0;
		int consonents = 0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)== 'A' || str.charAt(i)== 'I' || str.charAt(i)== 'O' || str.charAt(i)== 'U' || str.charAt(i)== 'E' ||
					str.charAt(i)== 'a' || str.charAt(i)== 'e' || str.charAt(i)== 'i' || str.charAt(i)== 'o' || str.charAt(i)== 'u') {
				vowels++;
			}else {
				consonents ++;
			}
		}
		System.out.println("vowels : - "+ vowels + " "+ "Consonents : - " + consonents);
	}
}
