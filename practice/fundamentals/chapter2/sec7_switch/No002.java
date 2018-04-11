package fundamentals.chapter2.sec7_switch;
/*
 * 0~6の数字を入力すると、その数字に対応した曜日が出力されるプログラムを作成してください。
 * 0~6のどの数字にどの曜日が対応するかは任意とする。
 */
public class No002 {
	public static void main(String[] args) {
		int x = 81;
		digit( x );

		x = 80;
		digit( x );

		x = 79;
		digit( x );

		x = 61;
		digit( x );

		x = 60;
		digit( x );

		x = 59;
		digit( x );

		x = 41;
		digit( x );

		x = 40;
		digit( x );

		x = 39;
		digit( x );
	}

	static void digit( int x ) {
		switch(x) {
		case
		}










		if( x >= 80 )					System.out.println( x + " is very good" );
		else if( x < 80 && x >= 60 )		System.out.println( x + " is good" );
		else if( x < 60 && x > 40 )		System.out.println( x + " is nomal" );
		else if( x <= 40 )				System.out.println( x + " is bad" );
		else							System.out.println( "Error" );
	}
}
