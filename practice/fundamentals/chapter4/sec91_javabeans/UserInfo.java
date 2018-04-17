package fundamentals.chapter4.sec91_javabeans;
/*
 * 次のユーザ情報クラスをJavaBeans仕様にしてください。
 */
public class UserInfo implements java.io.Serializable{
	private String userName;

	public UserInfo() {}
	public UserInfo( String userName ) {}

	public void setuserName( String userName ) {
		this.userName = userName;
	}
	public String getuserName() {
		return this.userName;
	}
}
