package jp.learningdesign.javastudy;

class Staff {
	String name;
	int staffid;
	String email;
}
public class StaffInfo {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Staff yamada = new Staff();
		yamada.name = "Kazuhito Nakayama";
		
		System.out.println(yamada.name);
		/*
		 * フィールドはデータを格納
		 * メソッドは処理の定義
		 * 
		 * publicはアクセス修飾子
		 * 
		 * クラスはたい焼きのかた
		 * インスタンスはたい焼き
		 */
	}

}
