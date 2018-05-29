package fundamentals.chapter10.sec1_list;

import java.util.ArrayList;

/*
 * 次の社員クラスをインスタンス化した際にコンストラクタで名前と年齢を設定して3人の社員を作成してください。
 * また、作成した社員をArrayListに格納し、for文を使用して名前と年齢を出力するプログラムを作成してください。
 */
public class No006 {
	public static void main(String[] args) {
		ArrayList< Employee > str = new ArrayList<>();
		str.add( new Employee( "織田信長", 35 ) );
		str.add( new Employee( "豊臣秀吉", 32 ) );
		str.add( new Employee( "徳川家康", 26 ) );
		for( Employee employee : str ) {
			System.out.println( employee.getName() + " : " + employee.getAge() + "歳" );
		}
	}
}
class Employee {
	String name;  // 名前
	int age;         // 年齢

	// コンストラクタ
	Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// getter/setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
/*
public class No009 {

}

class Employee {
	String name;  // 名前
	int age;         // 年齢

	// コンストラクタ
	Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// getter/setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
*/