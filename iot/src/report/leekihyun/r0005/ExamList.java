package report.leekihyun.r0005;

import java.util.ArrayList;
import java.util.List;

public class ExamList {
	
	
	public static void main(String[] args){
		ArrayList<Cal> list = new ArrayList<Cal>();  // Array는 list안에 들어가지만 List는 Array안에 들어갈 수 없다. List > Array
		//List는 입력 시에는 순서대로 입력되기 때문에 출력 시에만 키값이 필요하다.
		for(int i = 0; i<7; i++){
			Cal c = new Cal(i);
			list.add(c);   //list 값을 추가할 때.
			//System.out.println(c.a);
		}
		for(int i = 0; i<7; i++){
			Cal c2 = list.get(i);
			System.out.println(c2.a);	
		}
		//ArrayList listA = new ArrayList();
		//listA.add("박종훈");
		
		//System.out.print(listA.get(0));
	
	
	}
}
