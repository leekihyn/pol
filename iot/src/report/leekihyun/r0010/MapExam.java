package report.leekihyun.r0010;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;

public class MapExam extends HashMap {
	MapExam() {

	}

	public String put(String key) {
		if (!containsKey(key)) {
			put(key, "test");
			return "잘들어갓어요";
		}
		return "이미 있어";
	}

	public String toString() {
		String result = "";
		List<String> keys = new ArrayList<>(keySet());
		for (int i = 0; i < keys.size(); i++) {
			String key = keys.get(i);
			Object value = (Object) get(key);
			result += "[" + key + "," + value + "]\n";

		}

		if (result.equals("")) {

			result = "아무것도없어";
		}
		return result;
	}

	public static void main(String[] args) {
		MapExam me = new MapExam();
		me.put("A군", 50);
		me.put("B군", 60);
		me.put("C군", 60);
		me.put("C군", 60);
		System.out.println(me);

	}
}
