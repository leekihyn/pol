package report.leekihyun.r0002;

public class ArrayExam3 {

	public int[] getArrayVar(int initNum, int maxNum) {
		// initNum으로 시작해서 maxNum종료되는 반복문을 사용하여
				// 배열변수 a값을 집어넣고 배열변수a를 출력해주시면 됩니다.
				// 출력은 main함수에서 출력해주세요.

		int[] a = new int[maxNum - initNum];
		for (int i = initNum - initNum; i < maxNum - initNum; i++) {
			a[i] = i + 1;

		}

		return a;

	}

	public void printArrayVar(int[] a) {
		for (int i =  a.length-1; i>=0;  i--) {
			System.out.println("a의" + i + "번째 방의 값 =" + a[i]);
		}
	}

	public static void main(String[] args) {
		ArrayExam3 a3 = new ArrayExam3();
		int[] a = a3.getArrayVar(0, 6);
		// a3.printArrayVar(a);

		a3.printArrayVar(a);

	}
}
