package chapter2;

public class Sample18_0411 {
	public static void main(String[] args) {
		// Chapter2, 2_4, ==========
		int cnt2_4 = 0;
		while( cnt2_4 < 10 ) {
			System.out.println( ( cnt2_4 + 1 ) );
			cnt2_4++;
		}

		System.out.println();// Chapter2, 2_5, ==========

		int cnt2_5 = 0;

		System.out.println( "*** While***" );
		while ( cnt2_5 > 10 ) {
			System.out.println( cnt2_5 );
			cnt2_5++;
		}

		System.out.println();

		System.out.println( "***Do-While***" );
		do {
			System.out.println( "*" + cnt2_5 );
			cnt2_5++;
		} while ( cnt2_5 > 10 );


		System.out.println();// Chapter2, 2_6, ==========

		for( int cnt2_6 = 1; cnt2_6 < 10; cnt2_6++) {
			for( int j = 1; j < 10; j++ ) {
				System.out.print( cnt2_6 * j  + "\t");
			}
			System.out.println();
		}

		System.out.println();// Chapter2, 2_break& continue, ==========

		for( int cnt2_bc = 0;cnt2_bc < 10; cnt2_bc++ ) {
			if( cnt2_bc == 5 ) continue;
			//if( cnt2_bc == 5 ) break;
			System.out.println( cnt2_bc );
		}

		System.out.println( "\n◆\n" );// Chapter2, 2_break& continue, ==========

		OutSide:for( int cnt2_7 = 1; cnt2_7 < 10; cnt2_7++ ) {

			for( int j = 1; j < 10; j++) {
				if( cnt2_7 * j > 20 ) break OutSide;	// 外側（OutSide:の範囲）の繰り返しから抜ける
				if( cnt2_7 == 1 ) break;
				if(  j % 2 == 1 ) continue;
				System.out.println( cnt2_7 * j );
			}
		}

		System.out.println( "\n◆\n" );// Chapter2, 2_break& continue, ==========

		int num2_8 = 1100;
		if( num2_8 < 100 )System.out.println( "num2_8 is under 100." );
		if( num2_8 > 100 )System.out.println( "num2_8 is over 100." );
		else if( num2_8 == 100 )System.out.println( "num2_8 is just 100." );
		//else System.out.println( "num2_8 is not 100." );

		switch ( num2_8 ) {
			case 5:
				System.out.println( num2_8 + " is five" );
				break;
			case 10:
				System.out.println( num2_8 + " is ten" );
				break;
			case 100:
				System.out.println( num2_8 + " is handret" );
				break;
			default:
				System.out.println( num2_8 + " is fu●k you!" );
		}




	}
}