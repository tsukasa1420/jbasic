package fundamentals.chapter02.sec7_switch;
/*
 * 0~6の数字を入力すると、その数字に対応した曜日が出力されるプログラムを作成してください。
 * 0~6のどの数字にどの曜日が対応するかは任意とする。
 */
public class No002 {
	public static void main(String[] args) {
		int x = 0;
		weekDay( x );

		x = 1;
		weekDay( x );

		x = 2;
		weekDay( x );

		x = 3;
		weekDay( x );

		x = 4;
		weekDay( x );

		x = 5;
		weekDay( x );

		x = 6;
		weekDay( x );

		x = 7;
		weekDay( x );
	}

	static void weekDay( int x ) {
		switch(x) {
			case 0:
				System.out.println( "月曜日" );
				break;
			case 1:
				System.out.println( "火曜日" );
				break;
			case 2:
				System.out.println( "水曜日" );
				break;
			case 3:
				System.out.println( "木曜日" );
				break;
			case 4:
				System.out.println( "金曜日" );
				break;
			case 5:
				System.out.println( "土曜日" );
				break;
			case 6:
				System.out.println( "日曜日" );
				break;
			default:
				System.out.println( "Error" );
		}
	}
}
