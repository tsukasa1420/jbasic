package fundamentals.chapter4.sec3_field;
/*
 * クラス内でint型のインスタンス変数、static変数、ローカル変数を定義し、
 * メソッド内でそれぞれ定義した変数の和を表示させるプログラムを作成してください。
 */
public class No002 {
	public static void main(String[] args) {
		CalcSum cs = new CalcSum();
		cs.localFunc();
	}
}
class CalcSum{
	int instanceInt = 10;
	static int staticInt = 0;
	void localFunc() {
		int localInt = 10;
		System.out.println( instanceInt + staticInt + localInt );
	}
}