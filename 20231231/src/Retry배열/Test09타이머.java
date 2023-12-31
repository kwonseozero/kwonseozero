package Retry배열;

import java.util.Scanner;

public class Test09타이머 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("분을 입력하세요");
		int minute = sc.nextInt();
		System.out.println("초를 입력하세요."); 
		int second = sc.nextInt();
		
		int time = minute * 60 + second;
		
		for(int i=time; i>0; i--) {
			int m = i / 60, s = i% 60;
			System.out.println(m+"분"+s+"초 후 알람이 울립니다.");
			break;
		}
		System.out.println("띠링! 푸망개야 일어나!");
	}
}
