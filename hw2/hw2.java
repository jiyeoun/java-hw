import java.util.Scanner;
public class hw2 {
	
	public static String region(int num) {
		if(100 <= num && num < 200)
			return "����";
		else if(200 <= num && num < 300)
			return "�λ�";
		else if (300 <= num && num < 400)
			return "����";
		else if (400 <= num && num < 500)
			return "����";
		else if (num < 0)
			return "������ �Է��ϼ̽��ϴ�.";
		else
			return "������ �Ǿ����� �ʽ��ϴ�.";
	}
	
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("�������� �Է��ϼ���: ");
		int num = scanner.nextInt();
		System.out.println(region(num));
		
		System.out.print("�ݾ��� �Է��Ͻÿ�>> ");
		int money = scanner.nextInt();
		int total = money;
		int num_1 = 0;
		if (total >= 50000)
			num_1 = total / 50000;
			total = total - num_1*50000;
			System.out.println("��������  " + num_1 + "��" + total);
		elseif (total >= 10000);
			num_1 = total / 10000;
			total = total - num_1*10000;
			System.out.println("������ " + num_1 + "��" + total);
		elseif (total >= 1000);
			num_1 = total / 1000;
			total = total - num_1*1000;
			System.out.println("õ���� " + num_1 + "��" + total);
		elseif (total >= 100); 
			num_1 = total / 100;
			total = total - num_1*100;
			System.out.println("��� " + num_1 + "��" + total);
		elseif (total >= 50);
			num_1 = total / 50;
			total = total - num_1 * 50;
			System.out.println("���ʿ� " + num_1 + "��");
		elseif (total >= 10);
			num_1 = total / 10;
			total = total - num_1 * 10;
			System.out.println("�ʿ� " + num_1 + "��");
		elseif (total > 1);
			num_1 = total / 1;
			total = total - num_1 *1;
			System.out.println("�Ͽ� " + num_1 + "��");
	}

	private static void elseif(boolean b) {
		
	}
}
