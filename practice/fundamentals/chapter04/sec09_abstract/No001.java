package fundamentals.chapter04.sec09_abstract;
/*
 * 抽象クラスとして動物クラスを定義し、動物クラス内に鳴くというメソッド作成してください。
 * 作成した抽象クラスを使用して、鳴き声を出力するプログラムを作成してください。
 */
public class No001 {
	public static void main(String[] args) {
		Inu inu = new Inu();
		inu.cry();
	}
}
abstract class Animal{
	abstract void cry();
}
class Inu extends Animal{
	@Override
	void cry() {
		System.out.println("Bow");
	}
}