package fundamentals.chapter08;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
 * No001で作成した「test2.txt」を文字列として読み込んで画面に表示するプログラムを作成してください。
 */
public class No002 {

	public static void main(String[] args) {
		try {
			// HDDのどこにあるTXTファイルを選ぶかを指定している・その位置をpathに覚えさせている
			Path path = Paths.get( "c:/Training/test1.txt" );

			// TXTファイルの記述内容（中身）を読んでいる・日本語対応させるための第二引数
			BufferedReader bf = Files.newBufferedReader( path, Charset.forName("SJIS") );		// 一行ずつ読む

			// リード系の関数は呼び出されるたびに次の行に移る
//			System.out.println( bf.readLine() );			// 表示します（1行目読み込んで）
//			System.out.println( bf.readLine() );			// 表示します（2行目読み込んで）→改行コードがあるで！→改行コード番号
//			System.out.println( bf.readLine() );			// 表示します（3行目読み込んで）
//			System.out.println( bf.readLine() );			// 表示します（4行目読み込んで）→何も書かれてないやんけ！→null

			String readLine;
			while( (readLine = bf.readLine()) != null ){		// リードライン()だとStringで返る
				System.out.println( readLine );
			}

			bf.close();
		}
		catch (IOException e) {
			System.out.println( "ERROR" );
		}
	}
}