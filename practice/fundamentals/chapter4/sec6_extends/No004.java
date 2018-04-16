package fundamentals.chapter4.sec6_extends;
/*
 * 好きなスーパークラスと、そのスーパークラスを継承したサブクラスを作成してください。
 * また、それぞれに好きなフィールドとメソッドを追加してください。
 * 最後にNo004クラスのmainメソッドでサブクラスをインスタンス化して
 * 処理を実行するプログラムを作成してください。
 */
public class No004 {
	public static void main(String[] args) {
		Ko ko = new Ko( 10 );
		ko.work();
	}
}

class Oya{
	int age;
	Oya(){}
	Oya(int a){
		age = a;
		System.out.println(age);
	}
	void work() {
		System.out.println( "お仕事" );
	}
}
class Ko extends Oya{
	Ko(int a){
		this.age = a;
		System.out.println(this.age);
	}
	void work() {
		System.out.println( "学校" );
	}
}