package Retry배열;

import java.util.Scanner;

public class Test02이름입력 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=1; i<=5; i++) {
			System.out.print("이름 : ");
			String str = sc.next();
			System.out.println(str +"님! 환영합니다!");
		
		}
	}
}
