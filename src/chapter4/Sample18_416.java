package chapter4;

public class Sample18_416 {
	public static void main(String[] args) {
		JuniorAbstract ja = new JuniorAbstract();
		ja.funcAbstract();
		System.out.println();		// ==========
		//ja.super.funcNomal();		ここからはジュニアアブストラクトの親メソッドは呼び出せない
		ja.funcNomal();
		System.out.println();		// ==========

		classNameInter cni = new classNameInter();
		cni.funcInterFace();
		System.out.println();		// ==========

		// 参照型の型変換：
		// 変数名s1でStaffクラス、Managerクラスのどちらのメンバ・メソッドも呼び出せる？
		Staff s = new Manager();
		//Manager m =new Staff();	できない
		System.out.println();		// ==========

		// 参照型のキャスト変換：
		WorkInter wi = new Manager();		// インターフェースの抽象メソッドをオーバーライドした子クラスのメソッドは呼び出せる
		wi.funcTest();
		Manager m = (Manager)wi;			// インターフェースの子クラスの独自メソッドも呼び出せる
		m.funcTest();
		m.funcOrigin();
		System.out.println();		// ==========

		Mame mame = new Mame();
		mame.setUserName( "Jack" );
		System.out.println( "Your Name is " + mame.getUserName() );
	}
}
// 匿名クラス：再利用をしないクラス
/*
 class Secret{
	( new SecretOut() { void SecretFunc() {} } ).SecretFunc();
	//(new interface SecretIF() { String str = 0;})
}
*/

// ローカルクラス
class Local{
	int localInt = 0;
	void localFunc() {
		class Citizen{
			void CitizenFunc() {}
		}
	}
}

// ネストクラス：
class Parent{
	int parentInt = 0;
	void parentFunc() {
		System.out.println( "===== 親クラスのメソッド処理 =====" );
	}
	class Junior{
		int juniorInt = 0;
		void juniorFunc() {
			System.out.println( "===== 子クラスのメソッド処理 =====" );}
	}
}

// JavaBeans：開発業界のスタンダードなクラスの作り方（データの授受）
/*public */class Mame implements java.io.Serializable{
	// privateで宣言
	private int userId;
	private String userName;
	private String userPass;

	// publicで宣言・オーバーロードOK
	public Mame() {}
	public Mame( int userId, String userName, String userPass ) {}

	// publicで宣言・各メンバにつきひとつずつgetとsetを用意する
	public void setUserId( int userId ) {
		this.userId = userId;
	}
	public int getUserId() {
		return this.userId;
	}


	public void setUserName( String userName ) {
		this.userName = userName;
	}
	public String getUserName() {
		return this.userName;
	}


	public void setUserPass( String userPass ) {
		this.userPass = userPass;
	}
	public String getUserPass() {
		return this.userPass;
	}
}

// 参照型の型変換：
class Staff{}
interface WorkInter{
	void funcTest();
}
class Manager extends Staff implements WorkInter {
	public void funcTest() {}
	void funcOrigin() {}
}


// インターフェース：抽象...の亜種（発展形）
// インスタンス化はできない
interface NameInter{
	/*public static final */int interFaceInt = 0;		// 修飾子はデフォルトで付与されている。
	/*public abstract */void funcInterFace();		// 修飾子はデフォルトで付与されている。
}
interface SubInter extends NameInter{}
class classNameInter implements NameInter{		// 複数継承可
	@Override
	public void funcInterFace() {
		System.out.println( "===== インターフェースの抽象メソッドオーバーライド =====" );
		System.out.println( interFaceInt + "（インターフェースの変数（定数））" );
	}
}

// 抽象...：中身のないクラス・メソッド
// このクラスの子クラスでこの中のメソッドをオーバーライドさせる必要がある。
// （オーバーライドとはメソッドの再定義・機能追加・変更）
abstract class classAbstract {
	// 抽象メソッド：一つもなくてもアラーにはならないけどそれは意味がないこと
	abstract void funcAbstract() ;

	// 複数可 ⇒ 子クラスにこのメソッドもORしなきゃいけない
	abstract void func2nd() ;

	// 普通のメンバ・メソッドもOK
	int varNomalInt = 0;
	void funcNomal() {
		System.out.println( "===== 抽象クラス内の普通のメソッド =====" );
	}

	// 各々の子クラスで違う動きのメソッドをつくりたい
	// でも同じメソッド名で作りたいときに利用する
	// 同じ「ダメージを与えるメソッド」でもダメージ計算の仕方が違う、とか？
}
// classAbstractの子クラス
class JuniorAbstract extends classAbstract {		// 複数継承不可
	@Override
	void funcAbstract() {
		System.out.println( "===== 抽象メソッドをオーバーライドしたメソッド =====" );
	}
	@Override
	void func2nd() {
		System.out.println( "===== 抽象メソッドをオーバーライドしたメソッド2 =====" );
	}
	@Override
	void funcNomal() {
		super.funcNomal();
		System.out.println( "===== 普通のメソッドをオーバーライドしたメソッド =====" );
	}
}