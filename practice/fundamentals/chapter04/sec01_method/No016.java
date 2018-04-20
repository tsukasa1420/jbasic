package fundamentals.chapter04.sec01_method;
/*
 * 戻り値ありのメソッドを任意に作成し、メソッドを使用した結果を変数に入れずに出力するプログラムを作成してください。
 */
public class No016 {
	public static void main(String[] args) {
		System.out.println( Send.sender() );
	}
}
class Send{
	static String sender() {
		return "aaaaa";
	}
}