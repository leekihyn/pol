package report.leekihyun.r0012;

import java.util.Scanner;

// 응용 프로그램 언어 활용
public class FunctionExam {
	int[] arrNum = new int[5];
	Scanner s = new Scanner(System.in);
	int num = 0;

	int getNumberFromString() {

		try {

			System.out.println((num += 1) + "번쨰숫자를 넣어주세요.");

			return Integer.parseInt(s.nextLine()); // 숫자로 받아서 리턴해줘라

		} catch (Exception e) {
			num--;
			System.out.println("누가문자 넣으래!!"); // 문자넣으면 일루가짐.

			return getNumberFromString(); // 캐치되면 다시 제기호출을 하여 다시 입력하라고뜸.

		}

	}

	public static void main(String[] args) {

		FunctionExam ee2 = new FunctionExam();

		for (int i = 0; i < ee2.arrNum.length; i++) {

			ee2.arrNum[i] = ee2.getNumberFromString();

		}
		for (int i = 0; i < ee2.arrNum.length; i++) {
			System.out.println(ee2.arrNum[i]);
		}

	}

	public int getNumberFromString(int num) {
		// TODO Auto-generated method stub
		return 0;
	}
}