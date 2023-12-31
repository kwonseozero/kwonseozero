package Retry배열;

public class Test05배열뒤집기 {
	public static void main(String[] args) {
		//'30', '50', '20', '10', '40'을 배열에 저장하고
		//이 배열의 모든 데이터의 위치를 반대로 뒤집은 뒤 
		//출력하세요

		//배열 준비
		int[] numbers = new int[] {30, 50, 20, 10, 40};
	
		
		int left = 0;
		int right = numbers.length-1;
		for(int i=1; i < numbers.length/2; i++) {
			//left위치와 right위치를 바꾸면 된다
			int backup = numbers[left];
			numbers[left] = numbers[right];
			numbers[right] = backup;
			
			left++;
			right--;
			
			//다음 턴을 위해서 left는 1증가, right는 1감소처리
		}
		
		//출력
		for(int i=0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
	}
}
