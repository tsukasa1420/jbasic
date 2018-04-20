package chapter02;

public class Practice02 {
	public static void main(String[] args) {
		int num = 0;

		num = 10;
		System.out.println( "======後置の場合====\n" + num + "\n" + (num++) + "\n" + num );

		num = 10;
		System.out.println( "======前置の場合====\n" + num + "\n" + (++num) + "\n" + num );

		num = 5;

		num += 2;
		System.out.println( "====== ◆ += ◆ ====\n" + num );

		num -= 3;
		System.out.println( "====== ◆ -= ◆ ====\n" + num );

		num *= 2;
		System.out.println( "====== ◆ *= ◆ ====\n" + num );

		num /= 2;
		System.out.println( "====== ◆ /= ◆ ====\n" + num );

		num %= 3;
		System.out.println( "====== ◆ %= ◆ ====\n" + num );
	}
}