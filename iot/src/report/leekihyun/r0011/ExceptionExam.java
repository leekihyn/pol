package report.leekihyun.r0011;

import java.util.Scanner;

public class ExceptionExam {
	// public static void main(String[] args) {
	//
	// Scanner scan = new Scanner(System.in);
	// int result = 0;
	//
	//
	// for (int i = 1; i <= 10; i++) {
	// String a3 = scan.nextLine();
	// result += Integer.parseInt(a3);
	// }
	// System.out.println("총점=" + result);
	//
	// System.out.println("평균=" + (result / 10));
	//
	//
	//
	//
	// }
	//
	//
	// }

	// 반복문을 사용하여 Scanner클레스를 이용해
	// 총 10명의 학생의 점수를 받아주세요.
	// 10명의 학생의 총점과 평균을 구해주세요.

	public void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int result = 0;

		for (int i = 0; i <= 10; i++) {
			String str = s.nextLine();
			result += Integer.parseInt(str);

		}
		System.out.println(result);
	}

}
