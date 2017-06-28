package report.leekihyun.r0005;

public class Exam2 {
	
	public static void main(String[] args){
		//0~4 까지 반복하는 반복문을 작성.
		//cal(int a)라고 선언된 생성자를 호출하여 1~5까지 출력을 해보시기 바랍니다.
		
		
		Cal[] c = new Cal[5];
		// Cal은 인트형이 아니기 때문에 출력 시 null이 출력됨. 생성자가 아니고 방만 만들어줌.
		//System.out.println(c[0]);
		
		for(int i = 0; i <= 4; i++){
			//c[i] = new Cal(i+1);  //방이 만들어져 있는 c를 사용하여 i값을 입력 시킨다.
			Cal e = new Cal(i+1);
		}
		
		for(int i = 0; i <= 4; i++){
			System.out.println(c[i].a);
		}		
	}

}
