package fundamentals.chapter00;
/*
 * 次の従業員クラスを作成し、コンストラクタで名前と入社日を設定できるようにしてください。
 * mainメソッド内で3人の従業員を生成し、それぞれの名前と入社日を出力するプログラムを作成してください。
 * <フィールド>
 * ・名前
 * ・入社日
 */
public class No004 {
	public static void main(String[] args) {
		Employee e1 = new  Employee( "田中太郎", 4, 1 );
		Employee e2 = new  Employee( "佐藤広志", 10, 14 );
		Employee e3 = new  Employee( "酒井幸喜", 1, 20 );
		System.out.println( e1.returnStr() );
		System.out.println( e2.returnStr() );
		System.out.println( e3.returnStr() );
	}
}
class Employee{
	String name;
	int m,  d;
	Employee() {}
	Employee( String name, int m, int d ) {
		this.name = name;
		this.m = m;
		this.d = d;
	}
	String returnStr() {
		return name + m + "/ " + d;
	}
}