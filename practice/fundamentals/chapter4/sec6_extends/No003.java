package fundamentals.chapter4.sec6_extends;
/*
 * No002のAnimalクラスを継承したDogクラスを作成してください。
 * Dogクラスにはお座りするメソッドを追加してください。
 * mainメソッドでDogクラスをインスタンス化し、犬の名前とお座りしたことを表示させてください。
 */
public class No003 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.setName("pothi");
		System.out.println(dog.getName());
		dog.sitDown("お座り");
	}
}

class Dog extends Animal{
	void sitDown(String order) {
		if(order == "お座り") System.out.println( "すとん" );
		else System.out.println( "Bow" );
	}
}