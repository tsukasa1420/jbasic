package la.java;

public class Sample2 {

	// 学生の点数
	static double[] point = {86, 109, 120, 66, 148, 101, 150, 78};/*new double[std_num];
	point[0] = 60;
	point[1] = 70;
	point[2] = 80;
	point[3] = 95;
	point[4] = 95;*/

	// 学生の人数
	static int std_num = point.length;

	public static void main( String[] args ) {
		/*
		int x = add( 3, 4 );
		int y = sub( 9, 3 );

		System.out.println( "x = " + x );
		System.out.println( "y = " + y );

		int a =10;
		System.out.println( a );
		*/


		System.out.println(std_num);
		System.out.println();

		// 学生たちの偏差の格納先
		double[] ret_dev = new double[std_num];

		// 学生たちの偏差値の格納先
		double[] ret_dev_val = new double[std_num];

		// 学生たちの偏差を ret_dev に格納している
		for( int i = 0; i < std_num; i++ ) {

			System.out.println("◆"+point[i]);

			ret_dev[i] = My_dev( point[i], point );
			System.out.println( "偏差 " + point[i] + "：\t" + ret_dev[i] );
			System.out.println();
		}

		System.out.println();

		// 学生たちの偏差値を ret_dev_val に格納している
		for( int i = 0; i < std_num; i++ ) {
			ret_dev_val[i] = My_dev_val( point[i], point, ret_dev , i);
			System.out.println( "偏差値 " + point[i] + "：\t" + ret_dev_val[i] );
		}
	}

	public static int add( int a, int b ) {
		return a + b;
	}

	public static int sub( int a, int b ) {
		return a - b;
	}

	// 平均値を返す
	static double My_ave(double[] point) {
		// 平均値の格納先
		double My_ave_ave = 0;

		for( int i = 0; i < std_num; i++ ) {
			My_ave_ave += point[i];
		}

		System.out.println(My_ave_ave / std_num);

		return My_ave_ave / std_num;
	}

	// 個々人の偏差を返す
	static double My_dev( double ind, double[] point ) {
		// 平均値関数を呼び出して格納
		double ret_ave = My_ave( point );

		return ( ind - ret_ave );		// 差を返す
	}

	// 偏差平方和の平方根が標準偏差
	static double My_dev_2_sum(double[] ret_dev) {
		double stnd_dev = 0;

		for( int i = 0; i < std_num; i++ ) {
			stnd_dev += ( ret_dev[i] * ret_dev[i] );
		}

		return Math.sqrt(stnd_dev);
	}

	// 偏差と点数と平均を受け取る　10（点数-平均）/標準偏差+50　
	static double My_dev_val( double ind, double[] point, double[] ret_dev, int i ) {
		double ret_ave = My_ave( point );	// 平均値
		double Md_2_sum = My_dev_2_sum( ret_dev );	// 標準偏差

		return 10 * ( point[i] - ret_ave ) / Md_2_sum + 50;
	}






}