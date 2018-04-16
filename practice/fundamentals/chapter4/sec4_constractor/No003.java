package fundamentals.chapter4.sec4_constractor;
/*
 * No002とは別に人間クラス「Human」を作成し、mainメソッド内でインスタンス化してください。
 * インスタンス化の際に「あなたのIDは1です。」と表示されるようにコンストラクタを追加してください。
 * また、表示されるID番号はインスタンス化するたびに1ずつインクリメントされるようにしてください。
 */
public class No003 {
	public static void main(String[] args) {
		Human sato = new Human();
		System.out.println();
		Human suzuki = new Human();
		System.out.println();
		Human tanaka = new Human();
		System.out.println();
	}

}
class Human{
	// プログラム中一度しか初期化されない（何度呼び出されてもidはゼロにならない）
	// カウンタの役割を果たす
	static int id = 0;
	Human() {
		id++;
		System.out.println( id );
		//addId();
	}
	//void addId() {}

}