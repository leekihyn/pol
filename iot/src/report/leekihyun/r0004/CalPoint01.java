package report.leekihyun.r0004;

import java.util.Scanner;

public class CalPoint01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int result = 0;
		int[] num = new int[5];
		for (int i = 0; i < num.length; i++) {
			System.out.println((i + 1) + "번째 학생의 점수를 입력해주세요=>:");
			String numStr = scan.nextLine();
			num[i] = Integer.parseInt(numStr);
			// System.out.println("입력하신" + (i+1) +"번째 학생의 점수 = "+ numStr);
			System.out.println("입력하신" + (i + 1) + "번째 학생의 점수 = " + num[i]);
			result += num[i];

		}
		System.out.println("입력하신 5학생의 점수의 총점 = " + (result));
		System.out.println("입력하신 5학생의 점수의 평균점수 = " + (result / num.length));

		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] > num[j]) {
					int tmep = num[i];
					num[i] = num[j];
					num[j] = tmep;
				}

			}
		}
		System.out.println("작은 수부터 출력:");
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i] + "");
		}
		System.out.println();

	}
}
