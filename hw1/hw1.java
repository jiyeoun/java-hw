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
		System.out.println("���� ���δ��б� ����Ʈ�����кο� ��������\n"
				+ "20181598 ������ �Դϴ�.\n"
				+ "�� ��̴� �ǾƳ� �����̰� �����ϴ°��� �����մϴ�.");

		System.out.print("������ �Է��ϼ���: ");
		radius = sc.nextInt();
		System.out.println("�Է¹��� ����: " + (int) radius);
		
		System.out.println("���� �ѷ���: " + circleRate(radius));
		System.out.println("���� ������: " + circleArea(radius));
	}
}