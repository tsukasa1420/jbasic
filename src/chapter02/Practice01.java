package chapter02;

public class Practice01 {
	// 列挙
	protected enum Color{red, green, blue};

	public static void main(String[] args) {

		// オブジェクト生成みたいな感じで箱を作ってそれになんか格納（Stringみたいな書き方イメージ）
		Color red_jp = Color.red;
		System.out.println( red_jp );

		String result = check(Color.blue);
		System.out.println(result);
	}

	private static String check(Color color) {
		if(color == Color.red) return "Tomato";
		else if(color == Color.green) return "Leaves";
		else if(color == Color.blue) return "Mint";
		else return null;
	}
}