package report.leekihyun.r0002;

public class ArrayExam {

	public void printMultipleTable(int[] a, int[] b) {

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
		
			System.out.print( a[i] + "X" + b[j]+ "=" + (b[j]*a[i]) + ",");
			
			
		}
			System.out.println();
			
		}
	}
	
	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] b = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		ArrayExam a1 = new ArrayExam();
		a1.printMultipleTable(a, b);

	}

}
