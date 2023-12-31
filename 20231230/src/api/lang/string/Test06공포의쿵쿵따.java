package api.lang.string;

import java.util.Random;
import java.util.Scanner;

public class Test06공포의쿵쿵따 {
	public static void main(String[] args) {
//		첫 번째 제시어를 바나나로 설정해두고 사용자에게 단어를 입력받아서 쿵쿵따 게임을 진행하세요
//		사용자가 입력한 단어는 제시어와 이어져야 합니다.
//		사용자가 입력한 단어는 반드시 3글자여야 합니다.
//		위 조건을 만족하지 않을 경우 게임오버가 되며 프로그램이 종료됩니다.
//		단어를 정상적으로 입력한 경우 제시어가 입력한 단어로 바뀝니다.
//		위 작업을 반복적으로 진행합니다.
//  	아래 예시에서 ( )로 감싸진 부분이 사용자가 입력하는 부분입니다.
//		게임 오버 시 진행된 라운드 수 출력
//		제시어를 여러 개의 단어 중 랜덤으로 출력되도록 구현
//		한글만 입력하도록 검사 추가
		
		Scanner sc = new Scanner(System.in);
		String[] words = {"바나나", "카카오", "아이유", "유애나"};
		
		Random r = new Random();
		String word = words[r.nextInt(words.length)];
	
		int gameOver= 0;
		
		while(true) {
			System.out.println("제시어: "+word);
			String turn = sc.next();
			
			boolean isCung = turn.length() == 3 && turn.charAt(0) == word.charAt(2);
			int koreanCount = 0;
			
			for(int i=0; i < turn.length(); i++) {
				char ch = turn.charAt(i);
				if('가' <= ch && ch <= '힣') { //한글이라면
					koreanCount++;
		}
				}
				if(isCung && koreanCount == turn.length()) {
					System.out.println(turn+"!"+"쿵쿵따!");
					word =turn;
				}
				else {
					System.out.println("땡! 게임 오버!");
					gameOver++;
					System.out.println("게임 오버 라운드 수 : " +gameOver);
					break;
				}
			}
		
	}
}
