package fundamentals.chapter4.sec7_override;

/*
 * ユーザクラスを継承した一般ユーザクラスと管理者クラスを作成し、
 * showメソッドをオーバーライドしてください。
 * また、オーバーライドしたshowメソッド内で
 * idとnameに任意の値を代入するように修正してください。
 * 最後に、mainメソッド内でそれぞれのクラスをインスタンス化し、
 * showメソッドを実行するプログラムを作成してください。
 */
public class No003 {
	public static void main(String[] args) {
		General g = new General(123, "勇者");
		g.show();

		Manage m = new Manage(159, "GM");
		m.show();
	}
}
class General extends User{
	General(int id, String name){
		this.id = id;
		this.name = name;
	}
	@Override
	void show() {
		System.out.println("ユーザID：" + this.id + "一般ユーザ名：" + this.name);
	}
}

class Manage extends User{
	Manage(int id, String name){
		this.id = id;
		this.name = name;
	}
	@Override
	void show() {
		System.out.println("ユーザID：" + this.id + "管理ユーザ名：" + this.name);
	}
}

class User {
	String name;
	int id;
	User(){}
	void show() {
		System.out.println("ユーザID：" + id + "ユーザ名：" + name);
	}
}
/*
public class No003 {
	public static void main(String[] args) {

	}
}

class User {
	String name;
	int id;
	void show() {
		System.out.println("ユーザID：" + id + "ユーザ名：" + name);
	}
}
*/