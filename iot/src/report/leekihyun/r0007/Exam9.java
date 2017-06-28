package report.leekihyun.r0007;

import java.util.Scanner;

public class Exam9 {
	// Exam9에 private int a,b ,result를 선언해주세요
	// Exam9생성자에서 a값과 b값을 Scanner클래스의 nextLine()함수를 사용하여 대입해주세요.
	// i가 a부터 b까지 도는 반복문을 작성한뒤
	// result 의 i를 반복문만큼 더하는 함수를 작성해주세요.
	// result의 값을 출력하는 함수를 작성해서 Exam10에서 출력해주시기 바랍니다.,

	private int a;
	private int b;
	private int result;
	Scanner scan;

	public Exam9() {
		scan = new Scanner(System.in);
	}

	public void inputA() {
		System.out.println("초기값 입력");
		this.a = Integer.parseInt(scan.nextLine());
	}

	public void inputB() {

		System.out.println("맥스값 입력");
		this.b = Integer.parseInt(scan.nextLine());

	}

	public void doLoop() {
		for (int i = a; i <= b; i++) {
			result += i;
		}
	}

	public int getResult() {
		return result;

	}
}
