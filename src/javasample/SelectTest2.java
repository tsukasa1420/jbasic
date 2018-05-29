package javasample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectTest2 {
	public static void main(String[] args) {
		if( args.length != 1 ) {
			System.out.print( "年齢入力 : " );
			System.exit(1);
		}


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
			String sql = "SELECT * FROM emp WHERE age >= ?;";
			PreparedStatement st = cone.prepareStatement(sql);


			int age = 1;//Integer.parseInt(args[0]);
			st.setInt(1, age);


			// 実際にSQL文を実行している箇所（DB内の要素を変更する際はUpdate、そうでなければquery）
			ResultSet rs = st.executeQuery();

			while ( rs.next() ) {
				System.out.print( rs.getInt("code")		+ " : " );
				System.out.print( rs.getString("name")		+ " : " );
				System.out.print( rs.getInt("age")			+ " : " );
				System.out.println( rs.getString("tel")		+ " : " );
			}

			// 領域開放
			rs.close();
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