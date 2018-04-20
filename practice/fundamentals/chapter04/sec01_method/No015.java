package fundamentals.chapter04.sec01_method;

/*
 * Randomクラスを使用してランダムな整数を返すメソッドを作成してください。
 * 作成したメソッドを使用した結果を変数に格納してください。
 * 最後に変数に格納した結果を画面に表示させるプログラムを作成してください。
 */

//18 / 4 / 19
public class No015 {
	public static void main(String[] args) {
		int ran = 0, zero = 0, one = 0, two = 0, error = 0;
		for( int i = 0; i < 1000; i++ ) {
			ran = Random.randomFunc();
			if( ran == 0 ) zero++;
			else if( ran == 1 ) one++;
			else if( ran == 2 ) two++;
			else{
				error++;
				System.out.println(ran);
			}
		}
		System.out.println( "乱数 0\t: " + zero );
		System.out.println( "乱数 1\t: " + one );
		System.out.println( "乱数 2\t: " + two );
		System.out.println( "error\t: " + error );
		System.out.println();

		System.out.println( "乱数表示 : " + Random.randomFuncUtil() );
	}
}
class Random{
	static int randomFunc() {
		return (int)(Math.random()*3);
	}
	static int randomFuncUtil() {
		java.util.Random r = new java.util.Random();
		return r.nextInt(3);
	}
}
