package fundamentals.chapter00;

import java.util.ArrayList;
import java.util.List;

/*
 * 買い物リストクラスを作成し、「No」と「名称」と「価格」をメンバ変数に持たせ、
 * コンストラクタで各メンバ変数の値を設定するようにしてください。
 * また、メソッドには各メンバの値を設定するメソッド（setter）と、取得するメソッド（getter）を作成してください。
 * No011クラスで買い物リストを完成させ、
 * 100円以上のものと100円より下のもので分けて表示するようにしてください。
 */
public class No011 {
	public static void main(String[] args) {
		List<Shopping> shoppingList = new ArrayList<>();
		shoppingList.add( new Shopping(1, "りんご", 50) );
		shoppingList.add( new Shopping(2, "コーラ", 99) );
		shoppingList.add( new Shopping(3, "大根", 100) );
		shoppingList.add( new Shopping(4, "はさみ", 101) );
		shoppingList.add( new Shopping(5, "コート", 8000) );
		System.out.println( "100円未満" );
		for (Shopping sl : shoppingList) {
			if( sl.getWishPrice() < 100 ) {
				System.out.println( sl.getWishNo() + " : " + sl.getWishName() + " : \\" + sl.WishPrice );
			}
		}
		System.out.println( "\n100円以上" );
		for (Shopping sl : shoppingList) {
			if( sl.getWishPrice() >= 100 ) {
				System.out.println( sl.getWishNo() + " : " + sl.getWishName() + " : \\" + sl.WishPrice );
			}
		}
	}
}
class Shopping{
	int WishNo;
	String WishName;
	int WishPrice;

	Shopping( int WishNo, String WishName, int WishPrice ) {
		this.WishNo = WishNo;
		this.WishName = WishName;
		this.WishPrice = WishPrice;
	}

	void setWishNo(int WishNo) {
		this.WishNo = WishNo;
	}

	void setWishName(String WishName) {
		this.WishName = WishName;
	}

	void setWishPrice(int WishPrice) {
		this.WishPrice = WishPrice;
	}

	int getWishNo() {
		return WishNo;
	}

	String getWishName() {
		return WishName;
	}

	int getWishPrice() {
		return WishPrice;
	}
}