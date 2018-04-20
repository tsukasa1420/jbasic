package fundamentals.chapter04.sec02_class;
/*
 * No002とは別に「車」を表すクラスを定義してください。
 * フィールドやメソッドは任意に必ず1つ以上は定義するようにしてください。
 * また、No002クラスのmainメソッド内で車クラスをインスタンス化し、定義したメソッドを使用してみてください。
 */
public class No002 {
	public static void main(String[] args) {
		Car car = new Car();
		System.out.println( "車種\t\t" + car.carType );
		System.out.println( "タイヤの数\t" + car.tire( 4 ) );
	}
}

class Car{
	String carType = "HiAce";
	String tire( int tire ) {
		return tire + "本タイヤ";
	}
}
