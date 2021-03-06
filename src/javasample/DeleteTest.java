package javasample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteTest {
	public static void main(String[] args) {
		try {
			// JDBCを使えるようにするよ（JDBCのパスの指定）
			Class.forName("com.mysql.cj.jdbc.Driver");

			// 使いたいDBの場所、使うユーザーのユーザ名・パスワードを用意する
			String url = "jdbc:mysql://localhost/sample?serverTimezone=UTC&useSSL=false";
			String user = "student";
			String pass = "himitu";

			// ユーザー名・パスワードを使って任意のURLの先のDBにアクセス（ログイン）する
			Connection cone = DriverManager.getConnection( url, user, pass );



			// アクセスしたDBでやりたい操作のSQL文を書いて実行準備している
			String sql = "DELETE FROM emp WHERE code=4;";
			PreparedStatement st = cone.prepareStatement(sql);


			// 実際にSQL文を実行している箇所（DB内の要素を変更する際はUpdate、そうでなければquery）
			int rows = st.executeUpdate();
			System.out.println( rows + "件、レコードを削除しました" );


			// 領域開放
			st.close();
			cone.close();
		}
		catch (ClassNotFoundException e) {
			// JDBCのパスで使えないよ（Class.forNameが使えない）
			System.out.println("jdbcドライバが見つからないよ");
		}
		catch (SQLException e) {
			// Connectionクラス利用時のエラー処理
			System.out.println("DBに繋げられないよ");
		}
	}
}