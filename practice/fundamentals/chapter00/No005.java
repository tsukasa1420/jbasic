package fundamentals.chapter00;
/*
 * mainメソッド内にローカルクラスを作成し、その中に「Hello」を画面に表示させるプログラムを作成してください。
 */
public class No005 {
	public static void main(String[] args) {
		class Hello{
			void display() {System.out.println( "Hello" );}
		}
		Hello h = new Hello();
		h.display();
	}
}
