package jp.learningdesign.javastudy;

public class BmiCalc {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*
		 * BMIを計算するアプリ
		 * BMI = 体重/(身長*身長)
		 * 
		 */
		double weight,height,bmi;
		
		weight = 85;
		height = 180;
		
		height /= 100;
		
		bmi = weight/(height*height);
		
		System.out.println(bmi);
		
		if (bmi < 18) {
			System.out.println("痩せ型");
		} else if (bmi < 24) {
			System.out.println("普通");
		} else {
			System.out.println("肥満");
		}
		/*
		 * 代入演算子
		 * 左右は同じ結果
		 * x += Y, = , x = x + y
		 * 
		 */
	}

}
