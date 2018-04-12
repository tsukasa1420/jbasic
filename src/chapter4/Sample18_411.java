package chapter4;

import java.util.ArrayList;

// main実行クラス
public class Sample18_411 {
	public static void main(String[] args) {

		// Variableのstaticメソッド、staticフィールドを使っている
		// staticメソッドを呼び出すときは「クラス名.メソッド名()」で呼び出せる
		Variable.getItem();
		System.out.println( Variable.staticInt );

		System.out.println( "\n◆\n" );

		// インスタンス
		Variable var = new Variable();	// インスタンス化
		var.instanceInt = 10;			// Variableのフィールドを使っている
		var.getPlofile();				// Variableのメソッドを使っている

		System.out.println( "\n◆\n" );

		MyClass myClass = new MyClass();
		myClass.printStuff( "Hey", 1 );
		System.out.println( "\n◆\n" );

		myClass.printStuff( "Hey", 1, 2 );
		System.out.println( "\n◆\n" );

		myClass.printStuff( "Hey", 1, 2, 3 );
		System.out.println( "\n◆\n" );

		StaticCodeSample scs01 = new StaticCodeSample();
		StaticCodeSample scs02 = new StaticCodeSample();
		System.out.println( "\n◆\n" );
		}
}

class SampleAcc18_0412{
	int nomalSam = 10;				// 同一クラス、同一パッケージのみで有効
	private int privateSam = 10;		// 同一クラスのみで有効
	protected int protectSam = 10;	// 同一クラス、同一パッケージ、サブクラスのみで有効
	public int publicSam = 10;		// どこからでも利用可能
}


class StaticCodeSample{
	static int counter = 0;

	// staticイニシャライザ
	static {
		counter++;
		System.out.println( "Static Code block counter : " + counter );
	}

	// コンストラクタ
	StaticCodeSample(){
		System.out.println( "Constructor : counter : + counter" );
	}
}

class Variable{
	int instanceInt;					// インスタンス変数・フィールド
	static int staticInt;				// static変数

	void getPlofile() {					//インスタンスメソッド
		int localInt;					// ローカル変数
		//System.out.println( localInt );	// ローカル変数は初期化しないとエラー吐くよ

		localInt = 100;
		System.out.println( localInt );
	}

	static void getItem() {				//staticなメソッド
		int localInt = 100;
		System.out.println( localInt );
	}

	ArrayList<String> getList(){
		ArrayList<String> als = new ArrayList<String>();
		return als;
	}
}

class MyClass{
	// 「データ型 ...変数名」可変長パラメータ、配列になってる
	void printStuff( String greet, int ...values ) {
		System.out.println( "----- call printStuff() : " );
		for(int valuesInt: values ) {
			System.out.println( greet + " : " + valuesInt );
		}
	}
}