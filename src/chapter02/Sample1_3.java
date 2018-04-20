package chapter02;

public class Sample1_3 {
	public static void main( String[] args ) {
		int a =100, b = 300;					// 変数の宣言と代入
		System.out.println( a + "\n" + b );		// 変数の利用
		a = 200;								// aに別の値を代入
		System.out.println( a  );					// 変数の利用
	}										// aには、3.14、’abc’など異なるデータ型の値を代入することはできない
}
