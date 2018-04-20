package fundamentals.chapter02.sec5_for;
/*
 * 1から10までの整数を足した結果を表示させるプログラムをfor文を使って作成してください。
 */
public class No004 {
	public static void main(String[] args) {
		int sum = 0;
		for( int cnt_no4 = 1; cnt_no4 <=10; cnt_no4++ ) sum += cnt_no4;
		System.out.println( sum );
	}
}
