package report.leekihyun.r0008;

import report.leekihyun.r0007.Exam11;

public class Exam12 extends Exam11 {

	Exam12(int a, int b) {
		super(a,b);
		this.a = a;
		this.b = b;
	}

	public static void main(String[] args) {
		Exam12 e12 = new Exam12(1, 2);
		e12.plus();
		e12.printResult();
	}
}
