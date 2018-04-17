package fundamentals.chapter7.sec2_throw;
/*
 * 次のshowメソッド内に、showメソッドの引数として渡されたint型変数noの値が
 * 0~2以外だった場合、エラー「ArrayIndexOutOfBoundsException」を発生させるようなプログラムを作成してください。
 * また、例外発生時の文字は「<入力された引数>は範囲外です。0~2の値を入れてください。」と表示されるようにしてください。
 */
public class No002 {
	public static void main(String[] args) {
		show(3);
	}
	
	private static void show(int no) {
		
		int[] array = {100,200,300};
		
		System.out.println(array[no]);
	}
}
