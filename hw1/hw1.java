package hw1;
import java.util.Scanner;

public class hw1 {
	
	public static double circleRate(double n) {
		final double PI = 3.14;
		double circleRate = n * 2 * PI;
		
		return circleRate;
	}
	
	public static double circleArea(double n) {
		final double PI = 3.14;
		double circleArea = n * n * PI;
		
		return circleArea;
	}
	
	
	public static void main(String args[]) {
		double radius;
		Scanner sc = new Scanner(System.in);
		System.out.println("저는 국민대학교 소프트웨어학부에 재학중인\n"
				+ "20181598 김지연 입니다.\n"
				+ "제 취미는 피아노 연주이고 게임하는것을 좋아합니다.");

		System.out.print("숫지를 입력하세요: ");
		radius = sc.nextInt();
		System.out.println("입력받은 숫자: " + (int) radius);
		
		System.out.println("원의 둘레는: " + circleRate(radius));
		System.out.println("원의 면적은: " + circleArea(radius));
	}
}