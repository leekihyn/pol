package report.leekihyun.r0012;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class DataTypeExam6 extends DataTypeExam51 {

	public HashMap getHashmap() {
		HashMap hm = new HashMap();
		System.out.println("클래스 정보를 입력하세여");
		hm.put("클래스", scan.nextLine());
		return hm;
	}

	public static void main(String[] args) {
		ArrayList<HashMap> alList = new ArrayList<HashMap>();
		DataTypeExam6 dte5 = new DataTypeExam6();
		for (int i = 0; i < 2; i++) {
			alList.add(dte5.getHashMap());

		}

		for (HashMap hm1 : alList) {

			System.out.print(("클래스") + ",");
			System.out.print(("나이") + ",");
			System.out.print(("나이") + ",");
			System.out.print(("성별") + ",");
		}

	}
}