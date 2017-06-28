package report.leekihyun.r0011;

import java.util.ArrayList;
import java.util.Scanner;

public class T3 {
	// ArrayListEdxam 에 멤버변수로 ArrayList변수를 하나 생성하여
	//

	ArrayList list;

	T3() {
		list = new ArrayList();
	}

	public static void main(String[] args){
		ArrayList list;
		Scanner scan = new Scanner(System.in);
			T3 ale = new T3();	//문제
		for(int i=0;i<10;i++){
			ale.list.add(i+1);
			
		}
		System.out.println(ale.list);
		
	}
}
