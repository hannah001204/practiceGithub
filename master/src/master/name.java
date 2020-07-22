package master;

import java.util.Scanner;

public class name {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("입력하세요: ");
		int a = scan.nextInt();
		
		System.out.println("you put"+a);
		scan.close();
	}
}
