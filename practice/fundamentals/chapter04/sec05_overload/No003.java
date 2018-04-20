package fundamentals.chapter04.sec05_overload;
/*
 * 足し算クラスを作成し、mainメソッド内でインスタンス化してください。
 * この際、インスタンス時の引数によって
 * 「数値の足し算」「小数点数の足し算」「文字列の結合」を行うように
 * 足し算クラスのコンストラクタを定義してください。
 */
public class No003 {
	public static void main(String[] args) {
		Sum s1 = new Sum(10, 20);
		Sum s2 = new Sum(1.5, 3.2);
		Sum s3 = new Sum("10", "20");
	}
}
class Sum{
	Sum(){}
	Sum( int a, int b ){
		System.out.println(a+b);
	}
	Sum(double d1, double d02){
		System.out.println(d1+d02);
	}
	Sum(String s, String t){
		System.out.println(s+t);
	}
}