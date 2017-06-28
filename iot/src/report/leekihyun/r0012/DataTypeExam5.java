//package report.leekihyun.r0012;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Scanner;
//
//public class DataTypeExam5 {
//
//	public static void main(String[] args) {
//		ArrayList<HashMap> numList = new ArrayList<HashMap>();
//		ArrayList<HashMap> alList = new ArrayList<HashMap>();
//		Scanner scan = new Scanner(System.in);
//
//		for (int i = 0; i < 2; i++) {
//			HashMap hm = new HashMap();
//			System.out.println("클래스를 입력하세요");
//
//			hm.put("클래스", scan.nextLine());
//			hm.put("이름", scan.nextLine());
//			hm.put("나이", scan.nextLine());
//			hm.put("성별", scan.nextLine());
//			numList.add(hm);
//		}
//		for (HashMap hm1 : alList) {
//			HashMap resultHm = numList.get(i);
//			System.out.print(hm1.get("클래스") + ",");
//			System.out.print(hm1.get("이름") + ",");
//			System.out.print(hm1.get("나이") + ",");
//			System.out.println(hm1.get("성별"));
//
//		}
//
//	}
//
//}
