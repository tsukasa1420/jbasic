package fundamentals.chapter4.sec8_this;
/*
 * 次のTestクラスにコンストラクタを追加して、「Test!!!」が表示されるようにしてください。
 * ※必ずthisキーワードを使用すること
 */
public class No003 {
	public static void main(String[] args) {
		Test t = new Test();
	}
}

class Test {
	void method() {
		System.out.println("Test!!!");
	}
}