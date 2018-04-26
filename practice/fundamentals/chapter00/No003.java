package fundamentals.chapter00;
/*
 * 電話の抽象クラスを作成し、それを継承したiPhoneクラスとAndroidクラスを作成してください。
 * 電話の抽象クラス内で1つ以上のabstractメソッドを定義し、iPhone、Android側でオーバーライドしてください。
 * また、iPhone、Androidクラスでそれぞれ1つ以上オーバーライドしたメソッドを定義してください。
 * 最後にmainメソッドでそれぞれに定義したメソッドを使用して画面に出力するプログラムを作成してください。
 */
public class No003 {
	public static void main(String[] args) {
		iPhone ip = new iPhone();
		Android ad = new Android();
		ip.call(901234);
		ad.call(809865);
	}
}
abstract class Phone{
	abstract void call(int phoNum);
}
class iPhone extends Phone{
	void call(int phone) {
		System.out.println( phone );
	}
}

class Android extends Phone{
	void call(int andro) {
		System.out.println( andro );
	}
}