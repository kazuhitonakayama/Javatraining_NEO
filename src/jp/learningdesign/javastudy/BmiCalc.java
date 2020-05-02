package jp.learningdesign.javastudy;
import java.util.Scanner;
public class BmiCalc {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*
		 * BMIを計算するアプリ
		 * BMI = 体重/(身長*身長)
		 *
		 */
		double weight,height,bmi;

		Scanner stdIn = new Scanner(System.in);
		System.out.println("体重は? (kg)");
		weight = stdIn.nextDouble();
		System.out.println("身長は? (cm)");
		height = stdIn.nextDouble();
		// weight = 85;
		// height = 180;

		height /= 100;

		bmi = weight/(height*height);

		System.out.println("あなたのBMIは" + bmi + "です");

		if (bmi < 18) {
			System.out.println("そして、痩せ型です");
		} else if (bmi < 24) {
			System.out.println("そして、普通です");
		} else {
			System.out.println("そして、肥満です");
		}
		/*
		 * 代入演算子
		 * 左右は同じ結果
		 * x += Y, = , x = x + y
		 *
		 */
	}

}
