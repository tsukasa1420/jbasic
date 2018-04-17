package fundamentals.chapter4.sec91_javabeans;
/*
 * UserInfoクラスのフィールドに対し、データの登録と取得を行って
 * 取得したデータを画面に表示するプログラムを作成してください。
 */
public class Xxx {
	public static void main(String[] args) {
		UserInfo ui = new UserInfo();
		ui.setuserName("Mike Jeff");
		System.out.println( ui.getuserName() );
	}
}
