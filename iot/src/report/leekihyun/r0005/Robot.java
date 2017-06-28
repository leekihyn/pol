package report.leekihyun.r0005;

public class Robot { // 업무 시에는 속성과 행동하는 정의를 나눌 줄 알아야 한다.
	//속성 : 어떤 값을 가질 수 있는 것.(사람, 등등) 
	//행동 : 기능.(잔다, 누운다 등 ~~하다로 되는 것) 

	//속성 값
	String name;
	int age;
	
	
	public Robot(String name, int age){
		this.name = name;
		this.age = age;
		//String name;
		//int age;
		//this.name = "로보트";
		//this.age = 3; 
		//this를 붙임으로써 안에있는 변수를 사용하지 않고 바깥에 있는 변수를 사용함.
	}
	
	//행동 or 기능
	void doKick(){
		System.out.println(age + "살 먹은 로봇인 " + name + "가 발차기를 하다.");
	}
	
	void doRun(){
		System.out.println(age + "살 먹은 로봇인 " + name + "가 달리기를 하다.");
	}
	
	void doChange(){
		System.out.println(age + "살 먹은 로봇인 " + name + "가 변신을 하다.");
	}
	
	public static void main(String[] args){
		Robot r = new Robot("썬가드", 5);
		
		r.doKick();
		r.doRun();
		r.doChange();
	
		
	}
}
