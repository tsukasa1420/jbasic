package chapter04;

public class Sample18_413 {
	public static void main(String[] args) {
		System.out.println( OverLoad.sum( 1, 1 ) );
		System.out.println( OverLoad.sum( 1, 1, 1 ) );
		System.out.println( OverLoad.sum( 1, 1, 1, 1 ) );

		System.out.println( OverLoad.sum( 1.3, 1.7 ) );
		System.out.println( OverLoad.sum( 1.2, 1.1, 1.2 ) );
		System.out.println( OverLoad.sum( 1.1, 5.1 ) );

		ParentInh pi = new ParentInh();
		//System.out.println( pi.getName( "祐太郎", 34 ) );
		SonInh si = new SonInh();
		//System.out.println( si.getName( "武士", 4 ) );
		DaughterInh di = new DaughterInh();
		//System.out.println( di.getName( "春子", 2 ) );
		GraSonInh gsi = new GraSonInh();
		//System.out.println( gsi.getName( "周子", 20 ) );

		//ParentInh pi0 = new ParentInh( "123" );
		SonInh si0 = new SonInh( "123" );
		//DaughterInh di0 = new DaughterInh( "123" );
		//GraSonInh gsi0 = new GraSonInh( "123" );

		System.out.println();
		System.out.println();

		System.out.println( "///// コンストラクタ\t/////" );
		ThisKeyWord tkw = new ThisKeyWord();

		System.out.println();

		System.out.println( "///// メソッド\t\t\t/////" );
		tkw.method02();

		System.out.println();


		System.out.println( "///// メンバ\t\t\t/////" );
		tkw.setName( "*****" );
	}
}
// ===== クラスごとの講義内容 =====

class ThisKeyWord{
	// thisはコンストラクタ、メソッド、メンバを呼び出せる

	ThisKeyWord()				{ this( "Human" ); }		// ストリング型引数のコンストラクタ（↓）を呼び出している
	ThisKeyWord( String type )	{ System.out.println( "TYPE : " + type ); }

	void method01() {					System.out.println( "===== Method_01 =====" ); }
	void method02() { this.method01();	System.out.println( "===== Method_02 =====" ); }

	String name = "+++++";
	void setName( String name ) {
		System.out.println( "name :\t\t"		+ name );
		System.out.println( "\nthis.name :\t"	+ this.name );
		this.name = name;
	}
}

class ParentInh{
	/*
	子クラス（複数）で利用する共通のメンバ、メソッドを親クラスに記述しておく
	修正が楽、使いまわせる、似たメソッドを複数書くことによるバグを減らせる
	子クラスには最低限その子クラスでしか使わないメソッド等を書けばよい
	*/
	String name;

	ParentInh() {
		System.out.println( "親のデフォコン" + name );
	}
	ParentInh( String str ) {
		name = str;
		System.out.println( "親のデフォコン" + name );
	}

	String getName( String str, int age ){
		name = str;
		return name + age + "歳";
	}
}
// ParentInhの子クラス
class SonInh extends ParentInh{
	int cap;
	int getCap(){
		return cap;
	}
	// name、getNameも使える

	SonInh() {
		System.out.println( "子のデフォコン" + name );
	}
	SonInh( String str ) {
		super( str );		// 親のコンストラクタを呼んでいる
		name = str;
		System.out.println( "子のデフォコン" + name );
	}
	/*
	オーバーライド（メソッドの再定義・機能追加・変更）
	戻り値の方、メソッド名、引数（引数の型、数）は同じでなければならない
	親のfinalメソッドはオーバーライドできない
	*/
	@Override
	String getName( String str, int age ){
		name = str;
		return name + age + "さい";
	}
}
//ParentInhの子クラス
class DaughterInh extends ParentInh{
	int skirt;
	int getSkirt(){
		return skirt;
	}
	// name、getNameも使える

	DaughterInh() {
		System.out.println( "娘のデフォコン" + name );
	}
	DaughterInh( String str ) {
		name = str;
		System.out.println( "娘のデフォコン" + name );
	}
	/*
	オーバーライド（メソッドの再定義・機能追加・変更）
	戻り値の方、メソッド名、引数（引数の型、数）は同じでなければならない
	親のfinalメソッドはオーバーライドできない
	*/
	@Override
	String getName( String str, int age ){
		name = str;
		// super.を付ける事で、親クラスのgetNameを利用できるようになる
		int afterAge = 20;
		return name + age + "さい　" + afterAge + "年後 : " + super.getName(name, age + afterAge);
	}
}
// ParentInhの孫クラスで、SonInhの子クラス
class GraSonInh extends SonInh{
	// name、（子の）getNameも使える


	GraSonInh() {
		System.out.println( "孫のデフォコン" + name );
	}
	GraSonInh( String str ) {
		name = str;
		System.out.println( "孫のデフォコン" + name );
	}

	@Override
	String getName( String str, int age ){
		name = str;
		// 孫は親のメソッドを呼べない？
		return super./*super.*/getName(name, age);
	}
}


class Construct{
	int num;

	// クラス直下（フィールド）で宣言した変数の初期化
	Construct(){
		num = 0;
	}

	// コンストラクタもオーバーロード可能
	Construct( int a ){
		num = a;
	}
}

class OverLoad{
	static int sum( int num01, int num02 ) {
		return num01 + num02;
	}
	static int sum( int num01, int num02, int num03 ) {
		return num01 + num02 + num03;
	}
	static int sum( int num01, int num02, int num03, int num04 ) {
		return num01 + num02 + num03 + num04;
	}

	static double sum( double num01, double num02 ) {
		return num01 + num02;
	}
	static double sum( double num01, double num02, double num03 ) {
		return num01 + num02 + num03;
	}
	static double sum( double num01, double num02, double num03, double num04 ) {
		return num01 + num02 + num03 + num04;
	}
}