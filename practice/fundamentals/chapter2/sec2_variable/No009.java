package fundamentals.chapter2.sec2_variable;

/*
 * 次のプログラムの間違っている箇所を修正して
 * 正常に実行できるようにしてください。
 */
public class No009 {
	public static void main(String[] args) {
		float f = 1.2f;					// double f = 1.2;
		double d = 5.275;
		f = (float)d;

		System.out.println("f=" + f);
		System.out.println("d=" + d);
	}
}

/*

public class No009 {
	public static void main(String[] args) {
		float f = 1.2;
		double d = 5.275;
		f = d;

		System.out.println("f=" + f);
		System.out.println("d=" + d);
	}
}

*/