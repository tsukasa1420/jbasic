package fundamentals.chapter04.sec04_constractor;
/*
 * インスタンス化した際に、「Hello」と表示するクラス「Hello」を作成し、
 * mainメソッド内でインスタンス化してください。
 */
public class No002 {
	public static void main(String[] args) {
		Hello hello = new Hello();
	}
}
class Hello{
	Hello(){
		System.out.println( "Hello" );
	}
}