import java.util.Scanner;
public class hw3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		for(int j = 0; j < 1; j++) {
			System.out.println("양수 정수값을 입력하세요");
			num = scanner.nextInt();
			if (num > 0)
				continue;
			else
				j-=1;
		}
		
		int array[][] = new int [num][3];
		
		for(int i = 0; i<array.length; i++) {
			for(int j = 0; j < 3; j++){
				System.out.println((i+1) + "번째 학생" + (j+1) + "번째 시험점수를 입력하세요.");	
				int score = scanner.nextInt();
				if(score > 0)
					array[i][j] = score;
				else 
					j -= 1;
			}
		}

		System.out.println("------------------------------");
		
		int student_result[] = new int [num];
		for (int a = 0; a < num; a++){
			for (int b = 0; b < 3; b++){
				student_result[a] += array[a][b];
			}
		}
		
		for (int a = 0; a < num; a++) {
			System.out.println((a+1) + "번째 학생의 시험 점수 평균값은 " + student_result[a]/3 + "점 입니다.");
		}
		
		System.out.println("------------------------------");
		
		int sum[] = new int[3];
		for (int k = 0; k < 3; k++) {
			for (int m = 0; m < num; m++ ) {
				sum[k] += array[m][k];
			}
		}

		for (int k = 0; k < 3;k++) {
			System.out.println((k+1) + "번째 시험의 학생들의 점수 평균값은 " + sum[k]/num + "점 입니다.");
		}
		
		System.out.println("------------------------------");
		
		int total = 0;
		for (int k = 0; k < 3;k++) {
			total += sum[k];
		}
		System.out.println("전체 시험 점수 평균값은 " + total/(3*num) + "점 입니다.");
	}
}
