package chapter5;

import java.util.ArrayList;

public class Sample18_417 {
	public static void main(String[] args) {
		Array2d a2 = new Array2d();
		System.out.println();
		List1d l1 = new List1d();
		System.out.println();
		Array4d a4 = new Array4d();
		System.out.println();
	}
}






class Array1d{
	int[] arrayInt = {11, 23, 35, 47};
}
class Array2d{
	int[][] arrayInt = new int[4][4];
	Array2d() {
		arrayInt[0][0] = 10;	arrayInt[1][0] = 20;	arrayInt[2][0] = 30;	arrayInt[3][0] = 40;
		arrayInt[0][1] = 2;		arrayInt[1][1] = 4;		arrayInt[2][1] = 6;		arrayInt[3][1] = 8;
		arrayInt[0][2] = 3;		arrayInt[1][2] = 6;		arrayInt[2][2] = 9;		arrayInt[3][2] = 12;
		arrayInt[0][3] = 4;		arrayInt[1][3] = 8;		arrayInt[2][3] = 12;	arrayInt[3][3] = 16;

		for( int i = 0; i < arrayInt[0].length; i++ ) {
			for( int j = 0; j < arrayInt.length; j++ ) {
				System.out.print( arrayInt[j][i] + "\t");
			}
			System.out.println();
		}
	}
}
class List1d{
	ArrayList<Integer> listInt = new ArrayList<Integer>();
	List1d(){
		this.listInt.add(10);
		this.listInt.add(20);
		this.listInt.add(50);
		this.listInt.add(100);
		System.out.println( "リストの要素数：" + this.listInt.size() );
		for( int i = 0; i < this.listInt.size(); i++ ) {
			System.out.println(this.listInt.get(i) + "◆");
		}
		System.out.println();
		this.listInt.remove(1);
		for( int i = 0; i < this.listInt.size(); i++ ) {
			System.out.println(this.listInt.get(i) + "◆");
		}
	}
}

class Array4d{
	int[][][][] int4d = new int[2][2][2][2];
	Array4d() {
		//[ X軸上の位置 ][ Y軸上の位置 ][ Z軸上の位置 ][ パラメーター（HP, AT） ]
		int4d[0][0][0]		[0] = 5;		int4d[0][0][0]		[1] = 10;		// (0, 0, 0)上のHP:5、AT:10のキャラクター
		int4d[0][0][1]		[0] = 15;		int4d[0][0][1]		[1] = 20;		// (0, 0, 1)上のHP:15、AT:20のキャラクター
		int4d[0][1][0]		[0] = 25;		int4d[0][1][0]		[1] = 30;		// (0, 1, 0)上のHP:25、AT:30のキャラクター
		int4d[0][1][1]		[0] = 35;		int4d[0][1][1]		[1] = 40;		// (0, 1, 1)上のHP:35、AT:40のキャラクター
		int4d[1][0][0]		[0] = 45;		int4d[1][0][0]		[1] = 50;		// (1, 0, 0)上のHP:45、AT:50のキャラクター
		int4d[1][0][1]		[0] = 55;		int4d[1][0][1]		[1] = 60;		// (1, 0, 1)上のHP:55、AT:60のキャラクター
		int4d[1][1][0]		[0] = 65;		int4d[1][1][0]		[1] = 70;		// (1, 1, 0)上のHP:65、AT:70のキャラクター
		int4d[1][1][1]		[0] = 75;		int4d[1][1][1]		[1] = 80;		// (1, 1, 1)上のHP:75、AT:80のキャラクター

		for( int i = 0; i < int4d[0][0][0].length; i++ ) {
			for( int j = 0; j < int4d[0][0].length; j++ ) {
				for( int k = 0; k < int4d[0].length; k++ ) {
					for( int l = 0; l < int4d.length; l++ ) {
						System.out.print( int4d[i][j][k][l] + "\t");
					}
					System.out.println();
				}
			}
		}
	}
}