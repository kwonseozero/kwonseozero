package Retry배열;

public class Test03배열생성 {
	public static void main(String[] args) {
		//다음 정보를 저장할 수 있도록 배열을 만들고 데이터를 출력하세요
		//[1] 30, 50, 20, 10, 40
		//[2] 피카츄, 라이츄, 파이리, 꼬부기
		//[3]177.1f, 182.3f, 160.5f, 157.9f, 180.1f, 163.6f
		
		int[] a = new int[] {30, 50, 20, 10, 40};
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
		String[] b = new String[] {"피카츄", "라이츄", "파이리", "꼬부기"};
		for(int i=0; i<b.length; i++) {
			System.out.println(b[i]);
		}
		
		float[] c = new float[] {177.1f, 182.3f, 160.5f, 157.9f, 180.1f, 163.6f};
		for(int i=0; i<c.length; i++) {
			System.out.println(c[i]);
		}
	}
}
