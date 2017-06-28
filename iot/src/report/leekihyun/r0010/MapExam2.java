package report.leekihyun.r0010;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MapExam2 extends HashMap {
	// HashMap을 상속 받아 주세요.//
	// 키타입은 String,벨류 타입은 Integer로 선언해주세요.//
	// 키는 아무거나 넣으셔도 되지만 벨류는 반드시 숫자만 입력해야함.//
	// 총 10개의 키값을 생성해주세요.//
	// toString()함수를 오버라이딩 하여서
	// 해당 해쉬맵이 가지고 있는 전체 숫자를 더한값을 출력해주세요.

	public String toString() {
		String result = "";
		int a = 0;
		List<String> keyList = new ArrayList<>(keySet());
		for (int i = 0; i < keyList.size(); i++) {
			String key = keyList.get(i);
			Integer value = (Integer) get(key);

			result = (a += value) + ""; // 리턴보내버림

		}
		return result;
	}

	public static void main(String[] args) {
		MapExam2 m = new MapExam2();

		// for(int i=0;i<=10;i++){//<포문으로 사용햇을때
		// m.put(""+i,i);
		// }

		m.put("A임", 10);
		m.put("B임", 20);
		m.put("C임", 30);
		m.put("D임", 40);
		m.put("E임", 50);
		m.put("F임", 60);
		m.put("G임", 70);
		m.put("H임", 80);
		m.put("I임", 90);
		m.put("J임", 100);
		System.out.println(m);

	}
}
