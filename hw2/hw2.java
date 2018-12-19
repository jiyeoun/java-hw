import java.util.Scanner;
public class hw2 {
	
	public static String region(int num) {
		if(100 <= num && num < 200)
			return "서울";
		else if(200 <= num && num < 300)
			return "부산";
		else if (300 <= num && num < 400)
			return "대전";
		else if (400 <= num && num < 500)
			return "광주";
		else if (num < 0)
			return "음수를 입력하셨습니다.";
		else
			return "지정이 되어있지 않습니다.";
	}
	
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수값을 입력하세요: ");
		int num = scanner.nextInt();
		System.out.println(region(num));
		
		System.out.print("금액을 입력하시오>> ");
		int money = scanner.nextInt();
		int total = money;
		int num_1 = 0;
		if (total >= 50000)
			num_1 = total / 50000;
			total = total - num_1*50000;
			System.out.println("오만원권  " + num_1 + "매" + total);
		elseif (total >= 10000);
			num_1 = total / 10000;
			total = total - num_1*10000;
			System.out.println("만원권 " + num_1 + "매" + total);
		elseif (total >= 1000);
			num_1 = total / 1000;
			total = total - num_1*1000;
			System.out.println("천원권 " + num_1 + "매" + total);
		elseif (total >= 100); 
			num_1 = total / 100;
			total = total - num_1*100;
			System.out.println("백원 " + num_1 + "개" + total);
		elseif (total >= 50);
			num_1 = total / 50;
			total = total - num_1 * 50;
			System.out.println("오십원 " + num_1 + "개");
		elseif (total >= 10);
			num_1 = total / 10;
			total = total - num_1 * 10;
			System.out.println("십원 " + num_1 + "개");
		elseif (total > 1);
			num_1 = total / 1;
			total = total - num_1 *1;
			System.out.println("일원 " + num_1 + "개");
	}

	private static void elseif(boolean b) {
		
	}
}
