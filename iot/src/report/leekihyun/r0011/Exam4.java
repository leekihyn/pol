package report.leekihyun.r0011;

import java.util.Scanner;

public class Exam4 {
	final int initNum;
	int[] arrNum;

	Exam4(int initNum) {
		this.initNum = initNum;

	}

	public static void main(String[] args) {
		Exam4 ee2 = new Exam4(3);
		ee2.arrNum = new int[ee2.initNum];
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