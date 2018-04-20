package chapter04;

public class Sample18_412 {
	public static void main(String[] args) {
		//nomalInt = 123;				// 他クラスのフィールド変数は使えない
		//nomalInt = 123;				// 他クラスのフィールド変数は使えない
		//finalSample.finalInt = 123;		// 他クラスのフィールド変数は使えない
		//finalSample.finalInt = 123;		// 他クラスのフィールド変数は使えない
		finalSample.staticInt = 123;		// クラス名を前置することで使える
		//finalSample.S_fInt = 123;		// final定数なので初期化できない

		accessSample as = new accessSample();
		as.publicInt = 123;

		finalSample fs = new finalSample();
		fs.nomalInt = 123;				// 他クラスのフィールド変数は使えるように
		fs.nomalInt = 123;				// 他クラスのフィールド変数は使えるように


		SampleAcc18_0412 sam12 =new SampleAcc18_0412();
		sam12.nomalSam = 10;			// 同一クラス、同一パッケージのみで有効
		//sam12.privateSam = 10;		// 同一クラスのみで有効なので使えない
		sam12.protectSam = 10;		// 同一クラス、同一パッケージ、サブクラスのみで有効
		sam12.publicSam = 10;			// どこからでも利用可能

		Sample3_8 sam38 = new Sample3_8();
		// 基本データ型のデータの遷移
		int num = 100;
		System.out.println( "メイン内ので値 : " + num );
		sam38.basisArgs( num );
		System.out.println( "メイン内ので値 : " + num );		// メソッドでの変更が反映されない

		System.out.println();

		// 参照データ型のデータの遷移
		int arr[] = { 20, 40 };
		System.out.println( "メイン内ので値 : " + arr[0] );
		sam38.refArgs( arr );
		System.out.println( "メイン内ので値 : " + arr[0] );		// メソッドでの変更が反映される

		System.out.println();

		// 参照データ型のデータの遷移
		String str = "";
		System.out.println( "メイン内ので値 : " + str );
		sam38.strArgs( str );
		System.out.println( "メイン内ので値 : " + str );		// メソッドでの変更が反映される
	}
}

class Sample3_8{
	void basisArgs( int num ) {
		num += 30;
		System.out.println( "メソッド内の値 : " + num );
	}
	void refArgs( int arr[] ) {
		arr[0] += 30;
		System.out.println( "メソッド内の値 : " + arr[0] );
	}
	void strArgs( String str ) {
		str = "123";
		System.out.println( "メソッド内の値 : " + str );
	}
}

class accessSample{
	int nomalInt = 10;				// 同一クラス、同一パッケージのみで有効
	private int privateInt = 10;		// 同一クラスのみで有効
	protected int protectInt = 10;	// 同一クラス、同一パッケージ、サブクラスのみで有効
	public int publicInt = 10;		// どこからでも利用可能
}

class finalSample{
	int nomalInt = 0;				// ただの変数
	final int finalInt = 1;			// 定数となる
	static int staticInt = 10;		// 他クラスにて「クラス名.staticInt」で呼び出せる変数
	static final int s_fInt = 100;		// 他クラスにて「クラス名.sfInt」で呼び出せる定数
}