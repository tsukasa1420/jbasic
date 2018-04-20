package chapter07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Chapter7 {
	public static void main(String[] args) throws IOException {
		try {
			Try_Catch tc = new Try_Catch();
			tc.tryError();
			System.out.println();

			Thrower ter = new Thrower();
			System.out.println( ter.thrower( 15.0, 0.0 ) );
			System.out.println();
		}
		catch (ArithmeticException e) {
			System.out.println( "例外発生 : " + e + "\n" );
		}

		Assertion as = new Assertion();

		//assert ( as.assertion() ): "アサーション";		// 「assert 論理値 : エラーメッセージ（例外出力）」

		System.out.println(  "ばりゅー" );
		System.out.println();


		ReadFile rf = new ReadFile();
		rf.readFileFunc();
		System.out.println();

		ReadFile2nd rf2 = new ReadFile2nd();
		rf2.readFileFunc();

		WriteFile wf = new WriteFile();
		wf.writeFileFunc();
	}
}

class WriteFile{
	void writeFileFunc() throws IOException {
		// ここから
		Path path = Paths.get( "c:/Training/write.txt" );

		BufferedWriter bw = Files.newBufferedWriter(path);
		bw.write( "こんちわ" );
		bw.close();
		// ここまで

		// ここから
		BufferedWriter bw2 = Files.newBufferedWriter( Paths.get( "c:/Training/write.txt" ) );
		bw2.write( "おはよお" );
		bw2.write( "こんちわ" );
		bw2.write( "こんばんわ" );
		bw2.write( "おきてえええ" );
		bw2.close();
		// ここまで

		BufferedReader bf = Files.newBufferedReader( Paths.get( "c:/Training/Write.txt" ), Charset.forName( "UTF-8" ) );
		String contents;
		while ( ( contents = bf.readLine() ) != null ) {
			System.out.println( contents );
		}
	}
}

class ReadFile2nd{
	void readFileFunc() throws IOException {
		// ここから
		Path path = Paths.get( "c:/Training/TestJava.java" );

		BufferedReader bf = Files.newBufferedReader(path);
		String source;
		while ( ( source = bf.readLine() ) != null ) {
			System.out.println( source );
		}
		// ここまで

		// ここから
		BufferedReader bf2 = Files.newBufferedReader( Paths.get( "c:/Training/Test.txt" ), Charset.forName( "SJIS" ) );
		String contents;
		while ( ( contents = bf2.readLine() ) != null ) {
			System.out.println( contents );
		}
		// ここまで
	}
}

class ReadFile{
	void readFileFunc() {
		Path path = Paths.get( "c:/Training/Test.txt" );
		try {
			FileInputStream s = new FileInputStream( path.toFile() );

			int contents;
			while ( ( contents = s.read() ) != -1 ) {
				System.out.println( contents );
			}
			s.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			 e.printStackTrace();
		 }
		finally {
		}
	}
}

class Assertion{
	boolean assertion() {
		return false;
	}
}

class Throwers{
	// 例外処理は複数選択可能・例外処理の先延ばし・呼び出し先にtryを描くことを求めている
	void throwers() throws /**/ArithmeticException/**/, ArrayIndexOutOfBoundsException{
		System.out.println();
	}
}

class Thrower{
	double thrower( double num1, double num2 ) {
		if( num2 == 0.0 ) throw new ArithmeticException( "\n割る数が「0」は無効");
		else return num1 / num2;
	}
}

class Try_Catch{
	void tryError() {
		try {
			// ファイルを取得する
		}
		catch (Exception e) {
			// エラーログに書き込む
		}
		finally {
			// 必ず実行したい処理
		}
		try {
			System.out.println( 10 / 2 );
			System.out.println( 10 / 0  );

			System.out.println("◆◆◆");
		}
		catch ( ArithmeticException ae) {
			System.out.println( ae );
		}
		catch ( ArrayIndexOutOfBoundsException oe) {
			System.out.println( oe );
		}
		catch ( Throwable ae) {				// おおもとの親例外クラス・親例外クラスは子より後ろに書く
			System.out.println( ae );
		}
		finally {
			try {
				System.out.println( "finallyブロック実行！" );
			}
			catch (Exception e) {}
		}
		System.out.println("◇◇◇");		//例外処理でキャッチされなければここまで到達しない
	}
}