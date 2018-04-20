package fundamentals.chapter04.sec01_method;
/*
 * int型の年を受け取り、うるう年かどうかを判定するメソッドを定義してください。
 * うるう年の場合はtrue、違う場合はfalseを返します。
 * キーボード入力から年を受け取り、メソッドを使用して判定してください。
 * ※うるう年は、西暦が400で割り切れる年、または100で割り切れず、4で割り切れる年です。
 */
public class No005 {
	public static void main(String[] args) {
		System.out.println( leap( 100 ) );
	}

	/* うるう年かどうかを判別する。*/
	static boolean leap( int leap ) {
		if( leap % 400 == 0 || ( leap % 100 != 0 && leap % 4 ==0 ) ) {
			return true;
		}
		else {
			return false;
		}
	}
}
