package report.leekihyun.r0009;

import java.util.ArrayList;
import java.util.Collections;

public class ListExam {

	public static void main(String[] args) {
		ArrayList<String> arrList = new ArrayList<String>();
		for (int i = 0; i <= 3; i++) {
			arrList.add("" + i); // 문자+숫자 = 문자

		}
		// for (int i = 0; i < arrList.size(); i++) {
		// System.out.println(arrList.get(i));

		// }
		Collections.sort(arrList);
		for (int i = 0; i < arrList.size(); i++) {
			System.out.println(arrList.get(i));

		}
	}

}
