package report.leekihyun.r0010;

import java.lang.reflect.Array;

public class Exam444 {
///뭉제//
//5명의 학생의 점수를 Scanner클래스의 nextLine()함수를 사용하여 입력받아 총점 과 평균을 구하고
//점수가 낮은 순서대로 출력해주세요
//ex)입력 순서가 50점 60점 30점 70점 100점 이였다면
// 30,50,60,70,100 <-- 점수가 낮은 순서대로 출력
	
	
	
	public static void main(String[] args){
		int[] arrNum = new int[5];
		arrNum[0] = 10;
		arrNum[1] = 30;
		arrNum[2] = 50;
		arrNum[3] = 60;
		arrNum[4] = 30;
		Array.sort(arrNum);
		for(int i=0;i<arrNum.length;i++){
			System.out.println(arrNum[i]);
			
		}
		
	}
	
	
}
