package fundamentals.chapter7.sec1_trycatch;
/*
 * 次のプログラムを実行するとエラーが表示されました。
 * 例外処理を追加して、エラー発生時に「入力値が不正です。」と表示するようにプログラムを追加してください。
 */
public class No002 {
	public static void main(String[] args) {
		disp(1);
		disp(2);
		disp(3);
	}

	private static void disp(int no) {
		int n[] = {1,2,3};
		try {
			System.out.println(n[no]);
		} catch (Exception e) {
			System.out.println( "入力値が不正です。" );
		}
	}
}
/*
public class No002 {
	public static void main(String[] args) {
		disp(1);
		disp(2);
		disp(3);
	}

	private static void disp(int no) {
		int n[] = {1,2,3};

		System.out.println(n[no]);
	}
}
*/