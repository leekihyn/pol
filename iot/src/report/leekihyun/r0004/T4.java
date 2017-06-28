package report.leekihyun.r0004;

import report.parkkyounghun.r0003.ArrayExam7;

public class T4 {

	//강사님은 Array Exam7에 만드심 나는 T4

	// 자리수가 6개인 인트형 배열변수 a를 선언
	// 총6번 반복하는 반복문에서 
	// 아래에서 나오는 랜덤값을 배열변수 a에 0번째 방부터 차례로 입력하시면 됩니다.
	
	public int checkNum(int[] a){
		int random = (int)(Math.random()*45)+1;
		for(int i=0;i<a.length;i++){
			if(a[i]==random){
				random = (int)(Math.random()*45)+1;
				System.out.println(i + ":" + random);
				i=-1;
			}
		}
		return random;
	}
	public static void main(String[] args){
		int[] a = new int[45];
		ArrayExam7 ae5 = new ArrayExam7();
		for(int i=0;i<45;i++){
			a[i] = ae5.checkNum(a);
		}
		
		for(int i=0;i<45;i++){
			for(int j=i+1;j<45;j++){
				if(a[i]<a[j]){
					int tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
			}
		}

		for(int i=0;i<45;i++){
			System.out.println(i + "번째 로또번호는 : " + a[i]);
		}
	}
}
