package ch02_pjt_01;

public class MyCalculator {
	public void calculate(int fNum, int sNum, Icalculator calculator) {
		int value = calculator.doOperation(fNum, sNum);
		System.out.println("result : "+value);
	}
}
