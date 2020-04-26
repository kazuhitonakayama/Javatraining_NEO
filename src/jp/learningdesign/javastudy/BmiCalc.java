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
		height = 1.8;
		bmi = weight/(height*height);
		
		System.out.println(bmi);
	}

}
