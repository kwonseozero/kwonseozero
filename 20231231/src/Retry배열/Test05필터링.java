package Retry배열;

public class Test05필터링 {
    public static void main(String[] args) {
        System.out.println("1부터 20 사이의 홀수");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 1) {
                System.out.println(i + "홀수입니다.");
            }
        }

        System.out.println("-------");

        System.out.println("1부터 50 사이의 3의 배수");
        for (int k = 1; k <= 50; k++) {
            if (k % 3 == 0) {
                System.out.println(k + "3의 배수입니다.");
            }
        }
    }
}