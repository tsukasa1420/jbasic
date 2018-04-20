package fundamentals.chapter04.sec04_constractor;
/*
 * 次のようなフルーツクラスを作成してください。
 * <フィールド>
 * ・甘さ
 * ・色
 * ・大きさ
 *
 * <メソッド>
 * ・甘さを表示する
 * ・色を表示する
 * ・大きさを表示する
 *
 * このフルーツクラスをインスタンス化した際に、甘さ、色、大きさをコンストラクタによって初期化し、
 * その後甘さ、色、大きさをそれぞれ表示するプログラムを作成してください。
 *
 */
public class No004 {
	public static void main(String[] args) {
		Fruit f = new Fruit();
		f.fruitFunc( 'A', '赤', 10 );
	}
}
class Fruit{
	char sweet;
	char color;
	int size;
	Fruit(){
		sweet = 0;
		color = 0;
		size = 0;
	}
	void fruitFunc( char sweet, char color, int size ) {
		System.out.println( "甘さ：\t\t" + sweet );
		System.out.println( "色：\t\t" + color );
		System.out.println( "サイズ：\t" + size );
	}
}