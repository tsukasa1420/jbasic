package fundamentals.chapter4.sec6_extends;
/*
 * Animalクラスを継承したcatクラスを作成してください。
 * また、Catクラスには、鳴き声のフィールドを作成し、ニャーとなくメソッドを定義してください。
 * mainメソッドでCatクラスをインスタンス化して、
 * 猫の名前と「ニャー」を表示させるプログラムを作成してください。
 */
public class No002 {
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.cryAni();
		cat.setName("tama");
		System.out.println(cat.getName());
	}
}

class Cat extends Animal{
	String cry = "ニャー";
	void cryAni() {
		System.out.println( cry );
	}
}

class Animal {
	String name;

	String getName() {
		return this.name;
	}

	void setName(String name) {
		this.name = name;
	}
}
/*
public class No002 {
	public static void main(String[] args) {

	}
}

class Animal {
	String name;

	String getName() {
		return this.name;
	}

	void setName(String name) {
		this.name = name;
	}
}
*/