package report.leekihyun.r0008;

//
public class Son extends Father {

	// 아빠 클래스에서 배열변수를 선언하시고 10명의 학생의 점수를 입력받아주세요.
	// 단 배열변수의 데이터 타입은 int형이여야 합니다.
	// 출력함수는 아빠 클래스에서 선언해주시고
	// 호출만 아들 클래스에서 해주시기 바랍니다.
	Son() {
		System.out.println("아들 기본생성자 호출!!");
	}

	Son(int a) {
		System.out.println("오버로딩 개념으로 추가된 아들 생성자 호출!!");
	}

	public static void main(String[] args) {
		Son s = new Son();
		s.printIWithLoop();
	}
}

//
// // 아빠 클래스에서 값을 str1,str2를 Scanner클래스의 nextLine()함수를 사용하여 값을 입력받아 주세요,
// // 숫자값을 입력받아 정수로 변환해 주시고
// // 첫번째 값은 반복문의 초기값 두번째값은 반복문의 맥스값
// // 반복문만큼 i을 값을 출력하는 함수를 아빠 클래스에 선언해주시고
// // 아들클래스에서 호출하여 결과값을 나타내주세요.
// /////////////////////////////////////////////////////
//
// Son() { // 기본생성자 없다고 에러뜸 슈퍼를 써주던가 Father에 암것도없거나 해야함
// System.out.println("아들 기본생성자 호출!!");
// }
//
// Son(int a) {
// System.out.println("오버로딩 아들 호출");
// }
//
// public static void main(String[] args) {
// Son s = new Son();
// s.inputFormScanner1();
// s.inputFormScanner2();
// s.doLoop();
//
// System.out.println(s.getResult());
//
//
//
// }
// }
