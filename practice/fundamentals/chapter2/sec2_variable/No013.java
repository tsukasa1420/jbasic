package fundamentals.chapter2.sec2_variable;
/*
 * 次の値を入れるために、最適なデータ型と意味をよく表す変数名を考えて、変数の宣言をしてください。
 * また、サンプルデータをそれぞれの変数にリテラルとして入れて画面に出力してください。
 */
public class No013 {

	public enum BloodType { A, B, O, AB };

	public static void main(String[] args) {
		byte test;
		String fruit;
		float tax;

		test = 98;
		fruit = "りんご";
		tax = 0.08f;

		int salary;
		long population;
		byte dice;

		salary = 200000;
		population = 7000000000l;
		dice = 6;
		BloodType bt = BloodType.A;

		System.out.println(test+"\n"+fruit+"\n"+tax+"\n"+salary+"\n"+population+"\n"+dice+"\n"+bt);
	}
}
