package report.leekihyun.r0009;

import java.util.HashMap;

import javax.swing.text.html.HTMLDocument.Iterator;

public class MapExam2 {
	
	HashMap<String, Integer> hm;
	
	MapExam2(){
		hm = new HashMap<String, Integer>();
	}
	
	public static void main(String[] args){
		MapExam2 me = new MapExam2();
		me.hm.put("1",1);
		me.hm.put("2",2);
		me.hm.put("3",3);
		me.hm.put("4",4);
		me.hm.put("5",5);
		
		Iterator it = me.hm.keySet().iterator();
		while(it.hasNext()){
			String key = (String)it.next();
			System.out.print(key + ",");
			System.out.println(me.hm.get(key));
		}
	}
}


//	HashMap<String, Integer> hm;
//
//	MapExam2() {
//		hm = new HashMap<String, Integer>(); //똑같이 스트링 인트이져 넣어줘야함
//	}
//
//	public static void main(String[] args) {
//		MapExam2 me = new MapExam2();
//		me.hm.put("1", 1);
//		me.hm.put("1", 1);
//		me = new MapExam2();
//		System.out.println(me.hm.get("1"));
//		
//		Iterator it = me.hm.keySet().iterator();
//		while(it.hasNext()){
//			String key = (String)it.next();
//			System.out.println(key+",");
//			System.out.println(me.hm.get(key));
//		}
//
//	}
//}
