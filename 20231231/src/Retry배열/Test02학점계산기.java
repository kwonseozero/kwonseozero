package Retry배열;


public class Test02학점계산기 {
	public static void main(String[] args) {
		//90점 이상 100점 이하 A+
		//80점 이상 90점 미만 A
		//70점 이상 80점 미만 B
		//60점 이상 70점 미만 C
		//나머지는 F
		//switch구문으로 풀기
		
		int score = 95;
		
		score = score / 10 * 10;
		
		String grade;
		switch(score) {
		case 90: case 100:
				grade = "A+";
				break;
		case 80:
				grade = "A";
				break;
		case 70:
				grade = "B";
				break;
		case 60:
				grade = "C";
				break;
				default:
							grade = "F";
							break;
		}
		
		System.out.println("당신의 등급은 : " +grade+"입니다.");
	}
}
