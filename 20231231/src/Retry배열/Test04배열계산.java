package Retry배열;

public class Test04배열계산 {
	public static void main(String[] args) {
		//다음과 같은 학생 성적 정보가 있을 때 이를 배열에 저장하고 계산하여 출력
		//90, 67, 75, 88, 52, 59, 90, 92, 61, 72
		//불합격자(60점 미만) 점수만 출력
		//성적우수자(90점 이상) 점수만 출력
		//총점과 전체 평균을 출력
		//만약 80점인 학생이 전학을 온다면 예상되는 등수를 출력
		
	int[] scores = new int[] {90, 67, 75, 88, 52, 59, 90, 92, 61, 72};

	//불합격자 60점 미만 
	for(int i=0; i<scores.length; i++) {
		if(scores[i] < 60) {
			System.out.println("불합격자 점수 = " +scores[i]);
		}
	}
		//성적 우수자
		for(int i=0; i<scores.length; i++) {
			if(scores[i] >= 90) {
				System.out.println("성적우수자 점수 =" +scores[i]);
			}
		}
		
		int total = 0;
		for(int i=0; i<scores.length; i++) {
			total += scores[i];
		}
		System.out.println("총점 = "+total);
		
		double average = (double)total / scores.length;
		System.out.println("평균 = " + average);
		
		int rank =1;
		int point = 80;
		for(int i=0; i<scores.length; i++) {
			if(scores[i] > point) {
				rank++;
			}
		}
	
			System.out.println(point+"점의 예상 순위 =" +rank);
	}
}
