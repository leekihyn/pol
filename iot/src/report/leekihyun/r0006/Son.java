package report.leekihyun.r0006;

public class Son extends Father {
	int a;
	
	
	//int getAge(){
		//age = 38;
		//return age; //. 25를 보내줌
	//}
	public static void main(String[] args){
		Son s = new Son();
		s.a = 3;
		
		
		System.out.println(s.getAdress());
		System.out.println(s.getAge());
		System.out.println(s.getName());
		s.setName("박경훈");//
		System.out.println(s.getName());
		
	}
	
}

		//.System.out.println(s.age);  //첨에 65 Father에서 가져온거
		//.System.out.println(s.getAge()); // int getAge에서 age를 25로 바꾸어줌 그래서 25로됨
		//.System.out.println(s.age); // 위에서 25로 되서 25
		//.System.out.println(s.name);//이름
		
		
	//	Father f = new Father();
	//	System.out.println(f.address);
		
