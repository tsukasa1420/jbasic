package fundamentals.chapter00;
/*
 * 以下のフィールドを保持したユーザクラスを作成し、getter/setterを定義してください。
 * また、mainメソッド内で各フィールドに任意の値をセットして画面へ出力するプログラムを作成してください。
 * <フィールド>
 * ・ユーザID
 * ・ユーザ名
 * ・パスワード
 */
public class No002 {
	public static void main(String[] args) {
		User first = new User();

		first.setUserId(0001);
		System.out.println( first.getUserId() );
		first.setUserName("佐藤太郎");
		System.out.println( first.getUserName() );
		first.setUserPass("abc123");
		System.out.println( first.getUserPass() );

	}
}
class User{
	int userId;
	String userName;
	String userPass;


	public int getUserId() {
		return userId;
	}
	public String getUserName() {
		return userName;
	}

	public String getUserPass() {
		return userPass;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
}