package fundamentals.chapter00;
/*
 * mainメソッド内にRunnebleクラスを実装したローカルクラスを作成し、
 * 「インターフェース実装のローカルクラス」と表示させるプログラムを作成してください。
 */
public class No006 {
	public static void main(String[] args) {
		class Local implements Runnable{
			@Override
			public void run() {
				System.out.println( "インターフェース実装のローカルクラス" );
			}
		}
		Local run = new Local();
		run.run();
	}
}