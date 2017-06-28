package report.leekihyun.r0005;

import java.util.Scanner;

public class Cal2 {
	// int형 변수 2개를 멤버변수로 {클래스안에서 생성하시오.)
	// string형 변수 1개를 생성해주세요.
	// int형 변수는 num1, num2 string형 변수는 operator
	
	// printPlus(), printMinus(), printMultiple(). printDivision()
	// Cal2(int num1, int num2, String operator) 생성자를 선언하여
	// 각각의 멤버 변수에 대입해주세요.
	// 그리고 위의 함수를 호출했을때 원하는 결과 값을 출력해주세요.

	int num1;
	int num2;
	String operator;
	Cal2(int num1, int num2, String operator){
		this.num1 = num1;
		this.num2 = num2;
		this.operator = operator;
	}
	void printPlus(){
		//if(operator.equals("+")){
			System.out.println(num1 + " + " + num2 + " = " + (num1+num2) );
		//}else{
			//System.out.println("입력한 연산자가 + 연산자가 맞습니까?");
		//}
	}
	void printMinus(){
		//if(operator.equals("-")){
			System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
		//}else{
			//System.out.println("입력한 연산자가 - 연산자가 맞습니까?");
		//}
	}
	void printMultiple(){
		//if(operator.equals("*")){
			System.out.println(num1 + " X " + num2 + " = " + (num1 * num2));
		//}else{
			//System.out.println("입력한 연산자가 X 연산자가 맞습니까?");
		//}
	}
	void printDivision(){
		//if(operator.equals("/")){
			System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
		//}else{
			//System.out.println("입력한 연산자가 / 연산자가 맞습니까?");
		//}
	}
	public static void main(String[] args){
		
		Cal2 c2 = new Cal2(1,2,"+");  // "+" 연산자의 의미를 부여하여 만들가봐 일부러 string 변수를 선언한것.
		c2.printPlus();
		//c2 = new Cal2(1,2,"-");
		c2.printMinus();
		//c2 = new Cal2(1,2,"*");
		c2.printMultiple();
		//c2 = new Cal2(1,2,"/");
		c2.printDivision();
		
	}
}