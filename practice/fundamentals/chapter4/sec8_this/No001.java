package fundamentals.chapter4.sec8_this;
/*
 * 次のsetNameメソッド内に、引数で渡した名前をインスタンス変数nameに代入する処理を記述してください。
 */
public class No001 {
	private String name;
	public static void main(String[] args) {
		No001 n1 = new No001();
		n1.setName("安田");
		System.out.println(n1.getName());
	}
	
	public void setName(String name) {
		
	}
	
	public String getName() {
		return this.name;
	}

}
