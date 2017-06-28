package report.leekihyun.r0006;

public class Exam1 {

	String getInt2(int num) {
		if (num == 1) {
			return "1이네?";
		} else if (num == 2) {
			return "2구나~?";
		} else if (num == 3) {
			return "3 오예~";
		}
		return "얼레 뭔 숫자를 넣었데?";

	}

	// int getInt() {
	// for (int i = 0; i <= 10; i++) {
	// System.out.println(i);
	// if (i == 1) {
	// return i;
	// }

	// }
	// return -1;
	// }

	public static void main(String[] args) {
		Exam1 e = new Exam1();
		String str = e.getInt2(4);
		System.out.println(str);

	}
}