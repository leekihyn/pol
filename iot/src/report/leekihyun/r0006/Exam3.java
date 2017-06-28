package report.leekihyun.r0006;

public class Exam3{// {
		int getIndexFromArray(int[] arr, int num){
			for(int i=0;i<arr.length;i++){
				if(arr[i]==num){
					return i;
				}
			}
			return -1;
		}
		public static void main(String[] args){
			int[] a = new int[5];
			for(int i=0;i<5;i++){
				a[i] = (i+1) * 10;
			}
			Exam3 e3 = new Exam3();
			int idx = e3.getIndexFromArray(a, 30);
			System.out.println("30이란 값을 가지고 있는 방의 index = " + idx);
		}
	}


	
	//int getIndexFromArray(int[] arr, int num){
		//for(int i=0;<arr.length;i++){
			//if(arr[i]==num){
				//return i;
		//	}
	//	}
			
		//return -1;
	//	}
	
	//}

	
	
	
	//public static void main(String[] args){
		//int[] a = new int[5];
		//for(int i =0;i<5;i++){
			//a[i]= (i+1)*10;
			
	//	}
		//for(int i=0;i<5;i++){
			//System.out.println(a[i]);
	//	}
	//	for(int i=0;i<5;i++){
		//	if(a[i]==50){
			//	System.out.println("30이란 값을 가지고 있는 방의 index ="+i);
				
	//		}
		//}
//	}
//}
