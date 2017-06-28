package report.leekihyun.r0004;

public class Exam03 {
	

	
	int a = 0;
	int b =  0;
	int result = 0;
	
	public Exam03(){
	}
	

	public Exam03(int a,int b) {
		this.a = a;
		this.b = b;
		this.result = this.a + this.b;
	}

	public static void main(String[] args) {
		Exam03 e = new Exam03(1,2);
		System.out.println(e.result);
		
		Exam03 e2 = new Exam03(2,2);
		System.out.println(e2.result);

	}
}
