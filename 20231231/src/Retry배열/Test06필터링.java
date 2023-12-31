package Retry배열;

public class Test06필터링 {
	public static void main(String[] args) {
		
		for(int i = 1; i<=99; i++) {
			boolean ten = i / 10 ==5;
			boolean one = i % 10 == 5;
			if(ten || one) {
				System.out.println(i);
			}
		}
	}
}
