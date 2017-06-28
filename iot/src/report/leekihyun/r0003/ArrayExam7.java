package report.leekihyun.r0003;

public class ArrayExam7 {

	public static void main(String[] args) {
		int[] a = new int[20];
		for (int i = 0; i < 20; i++) {
			int random = (int) (Math.random() * 45) + 1;
			a[i] = random;

			for (int j = i + 1; j >= 0; j--) {
				if (j < 20 && a[j] == a[i] && i != j) {
					j = 0;
					i--;

				}
			}
		}
		for (int i = 0; i < 20; i++) {
			System.out.println((i + 1) + "번째 로또번호는 :" + a[i]);

		}
	}
}