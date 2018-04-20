package fundamentals.chapter08.sec1_stream;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
 * cドライブのtrainingディレクトリ内に任意の文字列を記述した「test1.txt」ファイルを作成し、
 * No001クラス内でtest1.txtないに記載された内容をバイト単位で読みこんで画面に表示するプログラムを作成してください。
 */
public class No001 {
	public static void main(String[] args) {
		try {
			// HDDのどこにあるTXTファイルを選ぶかを指定している・その位置をpathに覚えさせている
			Path path = Paths.get( "c:/Training/test1.txt" );

			// TXTファイルの記述内容（中身）をバイナリ（バイト単位）で読んでいる・
			FileInputStream fis = new FileInputStream( path.toFile() );

			// リード系の関数は呼び出されるたびに次の行に移る
//			System.out.println( bf.read() );			// 表示します（1行目読み込んで）
//			System.out.println( bf.read() );			// 表示します（2行目読み込んで）→改行コードがあるで！→改行コード番号
//			System.out.println( bf.read() );			// 表示します（3行目読み込んで）
//			System.out.println( bf.read() );			// 表示します（4行目読み込んで）→何も書かれてないやんけ！→null

			int readLine;
			while( (readLine = fis.read()) != -1 ){		// リード()だとintで返る
				System.out.println( readLine );
			}

			fis.close();
		}
		catch (IOException e) {
			System.out.println( "ERROR" );
		}
	}
}