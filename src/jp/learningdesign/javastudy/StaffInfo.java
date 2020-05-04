package jp.learningdesign.javastudy;

/**
 *  Author:Kazuhito Nakayama
 *  Email:firstjin19990101@gmail.com
 *  Belong:Osaka City University
 */

class Staff {
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStaffid() {
		return staffid;
	}

	public void setStaffid(int staffid) {
		this.staffid = staffid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Staff(String name, int staffid, String email) {
		super();
		this.name = name;
		this.staffid = staffid;
		this.email = email;
	}

	String name;
	int staffid;
	String email;
	
	public void sayhello() {
		System.out.println("Hello " + this.name + "\nYour ID is " + this.staffid + "\nAnd your email is " + this.email);
		//親のStaffクラスのnameというフィールドを参照する、という意味
	}
}

public class StaffInfo {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Staff yamada = new Staff("Kazuhito Nakayama",12345,"firstjin19990101@gmail.com");
		// yamada.name = "Kazuhito Nakayama!!!I'm college student,majoring LAW";
		
		// yamada.sayhello();
		// System.out.println(yamada.name);
		System.out.println("[社員情報]");
		System.out.println("氏名: " + yamada.getName());
		System.out.println("社員番号: " + yamada.getStaffid());
		System.out.println("Email: " + yamada.getEmail());
		
		
		
		
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
		 * 
		 * double height = 1.8
		 * height
		 * という変数に1.8のリテラルを代入
		 * 
		 * 
		 * 
		 */
	}

}
