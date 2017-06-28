package report.leekihyun.r0012;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class DataTypeExam51 {
	Scanner scan = new Scanner(System.in);

	public HashMap getHashMap() {
		HashMap hm = new HashMap();

		System.out.println("클래스를 정보를 입력하세요");
		hm.put("클래스", scan.nextLine());

		System.out.println("이름 정보를 입력하세요");
		hm.put("이름", scan.nextLine());

		System.out.println("나이  정보를 입력하세요");
		hm.put("나이", scan.nextLine());

		System.out.println("성별  정보를 입력하세요");
		hm.put("성별", scan.nextLine());
		return hm;  //아래에 hm넘겨줌
	}

	public static void main(String[] args) {
		ArrayList<HashMap> alList = new ArrayList<HashMap>();
		DataTypeExam51 dte5 = new DataTypeExam51();

		for (int i = 0; i < 2; i++) {
			HashMap hm = dte5.getHashMap();
			alList.add(hm);   //add로 hm계속 추가됨

		}

	}

}
