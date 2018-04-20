package chapter10;

import java.util.HashMap;
import java.util.Map;

public class Sample_420 {
	public static void main(String[] args) {
		Map<String, Integer> tizu = new HashMap<>();
		tizu.put("net", 600);
		System.out.println( tizu.entrySet() );
		System.out.println( tizu.get("net") );
	}
}
