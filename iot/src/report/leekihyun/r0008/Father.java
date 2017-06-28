package report.leekihyun.r0008;

import java.util.Scanner;

//import java.util.Scanner;
//
//public class Father {
//	// 아빠 클래스에서 값을 str1,str2를 Scanner클래스의 nextLine()함수를 사용하여 값을 입력받아 주세요,
//
//	// 숫자값을 입력받아 정수로 변환해 주시고
//	// 첫번째 값은 반복문의 초기값 두번째값은 반복문의 맥스값
//	// 반복문만큼 i을 값을 출력하는 함수를 아빠 클래스에 선언해주시고
//	// 아들클래스에서 호출하여 결과값을 나타내주세요.
//	/////////////////////////////////////////////////////

public class Father {
	Scanner scan;
	String str1, str2;
	int initNum, maxNum;

	Father() {
		scan = new Scanner(System.in);
		System.out.println("아빠 기본생성자 호출!!");
		
		inputFormScanner1();
		inputFormScanner2();
		castStringToInt();
	}

	void castStringToInt() {
		initNum = Integer.parseInt(str1);
		maxNum = Integer.parseInt(str2);
	}

	void inputFormScanner1() {
		str1 = scan.nextLine();
	}

	void inputFormScanner2() {
		str2 = scan.nextLine();
	}

	void printIWithLoop() {
		for (int i = initNum; i <= maxNum; i++) {
			System.out.println(i);
		}
	}

}

// int a = 3;
// Scanner scan;
// int str1;
// int str2;
// int result;
// int[] = new int[10];
//
// Father() {
// scan = new Scanner(System.in);
// System.out.println("아빠 기본생성자 호출!!");
// }
//
// public void inputA() {
// System.out.println("초기값 입력");
// int str1 = Integer.parseInt(scan.nextLine());
// }
//
// void inputFormScanner1() {
// System.out.println("초기값 입력");
// int str2 = Integer.parseInt(scan.nextLine());
//
// }
//
// void inputFormScanner2() {
// System.out.println("맥스값 입력");
// str2 = Integer.parseInt(scan.nextLine());
//
// }
//
// void doLoop() {
// for (int i = str1; i <= str2; i++) {
// result = i;
// }
// }
// public int getResult(){
// return result;
//
// }
// void doLoop2(){
// for(int i =1;i<=10;i++){
//
//
// }
// }
//
// }
// // Father(int a) {
// // System.out.println("오버로딩 개념으로 추가된 아빠 생성자 호출!!");
//
// // }