package report.leekihyun.r0008;

public class Tddddd {

	public void printPlusResult(int a, int b) {
		System.out.println("더한 결과값 : " + (a + b));
	}

	public int getPlusResult(int a, int b) {
		return a + b;

	}

	public static void main(String[] args) {

		Tddddd e = new Tddddd();// 문제
		e.printPlusResult(1, 3);
		int result = e.getPlusResult(1, 3);// 문제
		System.out.println("더한 결과값 :" + result);
	}
}
