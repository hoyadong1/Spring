package ch02_pjt_01;

public class CalAssembler {
	MyCalculator calculator;
	CalAdd calAdd;
	CalSub calSub;
	CalMul calMul;
	CalDiv calDiv;
	
	public CalAssembler() {
		this.calculator = new MyCalculator();
		this.calAdd = new CalAdd();
		this.calSub = new CalSub();
		this.calMul = new CalMul();
		this.calDiv = new CalDiv();
		
		assemble();
		
	}
	
	public void assemble() {
		calculator.calculate(10, 5, calAdd);
		calculator.calculate(10, 5, calSub);
		calculator.calculate(10, 5, calMul);
		calculator.calculate(10, 5, calDiv);
	}
}
