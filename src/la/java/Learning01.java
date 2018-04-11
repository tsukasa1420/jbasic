package la.java;

class Learning01 {
	// 学生の点数
	static double[] point = {28, 73, 89, 93, 54, 25, 68, 92, 88,54};
	// 学生の人数
	public static int stdt_num = point.length;

	static void main( String[] args ) {
		Test test = new Test();

		double[] devi_val	= new double[stdt_num];	// 学生たちの偏差値の格納先
		test.before_devi_val(point);					// 標準偏差を計算

		// 学生たちの偏差値を devi_val に格納している
		for( int i = 0; i < stdt_num; i++ ) {
			devi_val[i] = test.devi_val(i);
			System.out.println( "偏差値 " + point[i] + "：\t" + devi_val[i] );
			System.out.println();
		}
	}
}
class Test{
	Learning01 sam2 = new Learning01();
	//int stdt_num = sam2.stdt_num;
	//static double[] point = sam2.point;

	// ===== ◆計算式変数・配列◆ =====
	double sum = 0;							// 合計点の格納先
	double ret_ave = 0;						// 平均点の格納先
	double[] devi = new double[sam2.stdt_num];	// 偏差の格納先（個々）
	double devi_2_sum = 0;						// 偏差平方和の格納先
	double std_devi = 0;						// 標準偏差の格納先

	// ===== ◆計算式関数◆ =====　個々人の偏差を受け取って標準偏差を返す
	void before_devi_val( double[] point ) {
		for( int i = 0; i < sam2.stdt_num; i++ ) { sum += point[i]; }					// 合計点
		ret_ave = sum / sam2.stdt_num;											// 平均点
		for( int i = 0; i < sam2.stdt_num; i++ ) { devi[i] = point[i] - ret_ave; }			// 偏差（個々）
		for( int i = 0; i < sam2.stdt_num; i++ ) { devi_2_sum += ( devi[i] * devi[i] ); }	// 偏差平方和
		std_devi = Math.sqrt( devi_2_sum  / sam2.stdt_num );						// 標準偏差
	}

	double devi_val( int i ) {
		return 10 * ( sam2.point[i] - ret_ave ) / std_devi + 50;
	}
}