package chapter04;

class RnTest {
	public static void main(String[] args) {
		Car carNo0001 = new Car();
		carNo0001.run(10);		// 10L消費
		System.out.println( "ガソリンは残り " + carNo0001.check() + " Lです" );

		System.out.println();

		Car  carNo0002 = new Car();
		carNo0002.run(30);		// 30L消費
		System.out.println( "ガソリンは残り " + carNo0002.check() + " Lです" );
	}
}

class Car {
	// ガソリン量
	int gas = 60;

	void run( int gas ) {
		this.gas -= gas;
		System.out.println( gas * 10 + "km走行しました" );
	}

	int check() {
		return this.gas;
	}
}