package fundamentals.chapter4.sec1_method;
/*
 * int型の配列を受け取り、すべての要素の合計を返すメソッドを定義してください。
 * mainメソッドから、そのメソッドに配列を渡して合計を表示してください。
 * ※配列の要素数や値は任意とする
 */
public class No006 {
	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4, 5 };
		System.out.println( sum( array ) );

		class English123{
			void ghh() {
				System.out.println("English");
			}
		}
	}
	public static int sum( int array[] ) {
		int sumArray = 0;
		for( int intArray : array )  sumArray += intArray;
		return sumArray;
	}
}
