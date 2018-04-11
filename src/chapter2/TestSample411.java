package chapter2;

import java.util.ArrayList;
import java.util.Scanner;

public class TestSample411 {
	public static void main(String[] args) {

		// データ型1変数名1						// 配列でもStringでもOK
		// for( データ型1変数名2 : 変数名1 ){ 処理 }	// データ型は同じものを指定

		int i[] = { 10, 20, 30 };
		for( int j: i ) {
			System.out.println(  j + "***"  );
		}

		System.out.println();

		ArrayList<String> al = new ArrayList<String>();
		al.add( "りんご" );
		al.add( "みかん" );
		al.add( "かずら" );
		al.add( "のばら" );
		al.add( "すいか" );
		al.add( "あけび" );
		al.add( "ぶどう" );
		al.add( "さくら" );
		for( Object str: al ) {
			System.out.println(  str );
		}

		System.out.println();

		int cnt = 0;
		for ( ; cnt < 5; ) {
			System.out.println( cnt );
			cnt++;
		}

		// forとwhile、前者は繰り返す回数が想定できる(わかっている場合)

		System.out.println();

		Scanner scan = new Scanner( System.in );		// オブジェクト生成

		System.out.print( "文字列を入力してね：" );
		String name = scan.next();						// 入力を求めて入力値をnameに格納

		System.out.print( "整数値を入力してね：" );
		int age =scan.nextInt();						// intバージョン

		scan.close();								// Scannerクラスは閉じないとダメ

		System.out.println();

		System.out.println( "◆name :\t" + name );
		System.out.println( "◆age :\t\t" + age );
	}
}
