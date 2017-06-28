package report.leekihyun.r0006;

import java.util.Scanner;

public class CalExam {

	// 반복문을 사용하여 Scanner클레스를 이용해
	// 총 10명의 학생의 점수를 받아주세요.
	// 10명의 학생의 총점과 평균을 구해주세요.

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int result = 0;
		int[] num = new int[10];
		int[] num1 =new int[10];
		
		for (int i = 1; i <= 10; i++) {
			String a3 = scan.nextLine();
			result += Integer.parseInt(a3);
		}
		System.out.println("총점=" + result);

		System.out.println("평균=" + (result / 10));
		
		for(int i=0;i<10;i++){
			for(int j=i+1;j<10;j++){
				if(j<10&& num[i]<num[i]){
					int tmp = num[i];
					num[i] = num[j];
					num[j] = tmp;
							
				}
			}
		}
		
	for(int i=0;i<10;i++){
		System.out.println((i+1)+"등= "+ num[i]);
		System.out.println(i+"번째 학생의 점수="+ num1[i]);
	
	}
	}
}
