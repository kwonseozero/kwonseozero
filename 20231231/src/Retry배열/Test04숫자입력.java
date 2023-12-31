package Retry배열;

import java.util.Scanner;

public class Test04숫자입력 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=1; i<=7; i++) {
			System.out.print(i+"번째 숫자 입력:");
			String number = sc.next();
			System.out.println("입력하신 숫자는 \""+number+"\"입니다.");
		}
	}
}
