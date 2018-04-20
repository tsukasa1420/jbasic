package fundamentals.chapter02.sec7_switch;

/*
 * 点数が80点以上、60点以上、40点未満で表示結果を分けるプログラムをswitch文を使用して作成してください。
 */
public class No001 {
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
		switch(x){
			case 100 :
			case 99 :
			case 98 :
			case 97 :
			case 96 :
			case 95 :
			case 94 :
			case 93 :
			case 92 :
			case 91 :
			case 90 :
			case 89 :
			case 88 :
			case 87 :
			case 86 :
			case 85 :
			case 84 :
			case 83 :
			case 82 :
			case 81 :
			case 80 :
				System.out.println( x + " is very good" );
				break;
			case 79:
				System.out.println( x + " is good" );
				break;
			case 59:
				System.out.println( x + " is nomal" );
				break;
			case 40:
				System.out.println( x + " is bad" );
				break;
			default :
				System.out.println( "Error" );
		}
	}
}
