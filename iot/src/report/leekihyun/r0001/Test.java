package report.leekihyun.r0001;

public class Test {

	public void printMultipleTable(int initNum, int maxNum) {

		for (int i = initNum; i <= maxNum; i++) {

			int a = 1;
			for (a = initNum; a <= maxNum; a++) {
				System.out.print(i + "X" + a + " = " + (a * i) + ",");
			}

			System.out.println(i + "X" + a + " = " + (a * i));
		}
	}

	public static void main(String[] args) {
		Test t0 = new Test();
		t0.printMultipleTable(1, 5);

	}
}