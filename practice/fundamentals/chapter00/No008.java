package fundamentals.chapter00;
/*
 * Runnableインターフェースを使用して、「Hello ラムダ」が表示されるようにプログラムを作成してください。
 * ※ラムダ式を使用すること
 */

// 無名クラスの応用表記
public class No008 {
	public static void main(String[] args) {
		Runnable run = () -> {
			System.out.println( "Hello ラムダ" );
		};
		run.run();
	}
}
