package report.leekihyun.r0005;

public class Cal {
	// 1번문제
	// 인트타입의 2개의 파라메터 변수를 받는 생성자를 하나 만들어주세요.
	// 클래스 안에 인트타입의 변수 2개를 선언해주시고 
	// 클래스안에 있는 변수 2개에 생성자에서 받은 파라메터 변수의 값을 대입하여
	// printPlus() 함수에서 2개의 변수를 더한 값을 출력해주세요.
	// 2번문제
	// 클래스안에 스트링타입의 연산자를 저장하는 변수를 선언
	// 생성자에서 연산자를 저장하는 로직을 만들고
	// printCal()이라는 함수를 만들어 해당 함수를 호출하였을때 알맞은 연산이 되는 프로그램을 만들어주세요.
	
	
	//멤버 변수는 그 클래스 내에 선언된 변수를 말한다.
	int a; //멤버변수
	int b;
	String operator;
	
	//static int g = 5; //멤버변수 중 모든 인스턴스에 공통적으로 사용해야하는 것에 static을 붙인다
	//출처: http://arabiannight.tistory.com/entry/자바Java-static의-사용법과-개념예 [아라비안나이트]
	
	
	static int i = (int)(Math.random()*10);
	static int j = (int)(Math.random()*10);
	
	Cal(int a){
		//System.out.println(a + " 인트형 변수 파라메터를 한개를 가진 생성자를 호출하셨네요!");
		this.a = a;
		
	}
	
	
	Cal( int a, int b, String operator){
	 	this.a =  a;
		this.b = b;
		this.operator = operator;
		
	}
	/*
	void printPlus(){
		System.out.println(a + " + " + b + " = " + (a+b));
	}
	
	void printMinus(){
		System.out.println(a + " - " + b + " = " + (a-b));
	}*/
	
	void printCal(){ // ==는 메모리를 비교하고 equals는 값을 비교한다.
		if(operator.equals("+")){
			System.out.println(a + " + " + b + " = " + (a+b));
		}
		else if(operator.equals ("-")){
			System.out.println(a + " - " + b + " = " + (a-b));
		}
		else if(operator.equals ("*")){
			System.out.println(a + " * " + b + " = " + (a*b));
		}
		else if(operator.equals ("/")){
			System.out.println(a + " / " + b + " = " + (a/b));
		}
		else{
			System.out.println("조건이 맞지 않습니다. 조건을 다시 확인해주세요.");
		}
		
	}
	
	
	
	public static void main(String[] args){
		Cal c = new Cal(3, 4, "+");
		//c.printPlus();
		//c.printMinus();
		c.printCal();
		c.printCal();
	}
	
}
