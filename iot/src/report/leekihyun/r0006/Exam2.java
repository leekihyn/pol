package report.leekihyun.r0006;

public class Exam2 {

	String printFour(int num){
		for(int i=1;i<10;i++){
			if(i==num){
				return "어라 4?";   // return i;
						
			}
		}
		return "없던데?";    //return -1;
		
	}
	public static void main(String[] args){
		Exam2 e2 = new Exam2();
		String str = e2.printFour(4); //int str = e2.printFour(4);
		System.out.println(str);
		
	}
}
