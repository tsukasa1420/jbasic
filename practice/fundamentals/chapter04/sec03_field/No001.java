package fundamentals.chapter04.sec03_field;
/*
 * No001クラス内にインスタンス変数、static変数、ローカル変数を作成してください。
 */
public class No001 {
	int instanceInt = 10;
	static int staticInt = 10;
	void localFunc() {
		int localInt = 10;
		System.out.println( instanceInt + staticInt + localInt );
	}
}
