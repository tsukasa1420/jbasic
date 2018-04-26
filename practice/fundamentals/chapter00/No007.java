package fundamentals.chapter00;
/*
 * Runnableインターフェースを実装した無名クラスを作成し、
 * その中で「Hello 無名クラス」を表示するプログラムを作成してください。
 */
public class No007 {
	public static void main(String[] args) {
		Runnable run = new Runnable() {
			@Override
			public void run() {
				System.out.println( "Hello 無名クラス" );
			}
		};
		run.run();
	}
}