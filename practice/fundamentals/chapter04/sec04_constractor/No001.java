package fundamentals.chapter04.sec04_constractor;
/*
 * No001クラスとは別に下記のような車クラスを作成してください。
 *
 * <フィールド>
 * ・ガソリン
 *
 * <メソッド>
 * ガソリンを使用して走る機能
 * 現在の残ガソリンを確認する機能
 * 給油する機能
 *
 * <コンストラクタ>
 * ・ガソリンの初期値を指定する
 */
public class No001 {
	public static void main(String[] args) {
		Car car = new Car( 50 );
		car.run( 5 );
		car.charge( 10 );
	}
}
class Car{
	int gas;
	Car( int startGasAmount ){
		this.gas = startGasAmount;
	}
	void run( int gas ) {
		System.out.print( "🚗" );
		for( int i = 0; i < gas; i++ ) System.out.print( " -3" );
		System.out.println();
		this.gas -= gas;
		System.out.println( "のこり" + this.gas + "L" );
	}
	void charge( int chargeGas ) {
		this.gas += chargeGas;
		System.out.println( "のこり" + this.gas + "L" );
	}
}