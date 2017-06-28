package report.leekihyun.r0011;

import java.util.Scanner;

public class ExceptionExam2 {
	int[] arrNum = new int[10];

	// 10개의 방을 가지고 있는 int형 배열변수 arrNum을
	// ExceptionExam2의 멤버변수로 선언해주세요.
	// 2의 멤버변수를 선언해주세요.,
	// for문을 돌며 Scanner클래스의 nextLine()함수를 사용하여 아무런 값이나 입력해주세
	// 단 for문을 돌며 문자값이 입력됬을때 에러메세지 나오게 해주세요.
	public static void main(String[] args) {

		ExceptionExam2 ee2 = new ExceptionExam2();
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < ee2.arrNum.length; i++) {
			try {
				ee2.arrNum[i] = Integer.parseInt(s.nextLine());

			} catch (Exception e) {
				i--;

				System.out.println("누가문자 넣으래!!");

			}
		}
	}
}