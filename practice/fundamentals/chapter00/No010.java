package fundamentals.chapter00;

import java.util.ArrayList;
import java.util.List;

/*
 * クラス SeitoScore をつくり、名前と、点数をメンバー変数に持たせてください。
 * メソッドには名前と点数を返すメソッドを作り、コンストラクタで生徒名と点数を設定するようにしてください。
 * No010を使って５人の生徒の情報を管理し、５０点以上の生徒だけを表示するプログラムを作成してください。
 * ※Listクラスを必ず使用すること
 */
public class No010 {
	public static void main(String[] args) {
		List<SeitoScore> ssList = new ArrayList<>();
		ssList.add( new SeitoScore( "織田信長", 49 ) );
		ssList.add( new SeitoScore( "豊臣秀吉", 50 ) );
		ssList.add( new SeitoScore( "徳川家康", 51 ) );
		ssList.add( new SeitoScore( "宮本武蔵", 99 ) );
		ssList.add( new SeitoScore( "佐々木小次郎", 100 ) );

		for (SeitoScore ss : ssList) {
			if( ss.getScore() >= 50 ) {
				System.out.println( ss.getName() + "\t: " + ss.getScore() );
			}
		}
	}
}
class SeitoScore{
	String name;
	int score;

	SeitoScore( String name, int score ) {
		this.name = name;
		this.score = score;
	}

	String getName() {
		return name;
	}
	int getScore() {
		return score;
	}
}