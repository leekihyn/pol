package report.leekihyun.r0005;

public class Exam {
	// Robot 클래스가 가지고 이쓴 3가지 함수를 호출해서 결과 값을 출력해주세요.
	// 로봇의 이름은 지로봇, 나이는 10살이니다.
	// cal클래스를 사용하여 더하기 빼기 곱하기 나누기 연산값을 출력해주세요.
	// 단 첫 번째 변수는 10 두번째 변수는 2입니다.
	//static int[] a = {1,2,3,4,5};
	//static int b = (int)(Math.random()*10)+1;
	
	
	
	
	public static void main(String[] args){
		//Robot r = new Robot("지로봇",10);
		//Cal c = new Cal("+",a,b);
		
		for(int i = 1; i <= 10; i++){
			Cal c = new Cal(i,(11-i),"+"); // 11-i 를 할 시 역순으로 됨 11인 이유는 최대가 10이기 때문에.
			c.printCal();
			
		}
		
		
		
		//r.doKick();
		//r.doRun();
		//r.doChange();
		//e.multipleTable();
		
	}

}
