package jp.learningdesign.javastudy;

/**
 *  Author:Kazuhito Nakayama
 *  Email:firstjin19990101@gmail.com
 *  Belong:Osaka City University
 */

class Staff {
	String name;
	int staffid;
	String email;
}
public class StaffInfo {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Staff yamada = new Staff();
		yamada.name = "Kazuhito Nakayama!!!I'm college student";

		System.out.println(yamada.name);
		/*
		 * フィールドはデータを格納
		 * メソッドは処理の定義
		 *
		 * publicはアクセス修飾子
		 * protected：同一のパッケージ内・継承クラス
		 * なし：同一パッケージのみ
		 * private：同じクラス内のみ
		 *
		 * staticはその他の修飾子
		 * abstract：抽象クラス
		 * static：クラスから直接呼び出せる
		 * final：変更ができない
		 *
		 * voidは返り値のタイプ
		 *
		 * main(String[] args)
		 * mainはメソッド名
		 * （）内はパラメーター（引数）
		 *
		 * すなわちpublic static void main(String[] args)の一行は
		 * ・他のクラスから呼び出せて
		 * ・クラスから直接呼び出せて
		 * ・返り値を持たず
		 * ・argsという配列型の引数を持つ
		 *
		 * クラスはたい焼きのかた
		 * インスタンスはたい焼き
		 */
	}

}
