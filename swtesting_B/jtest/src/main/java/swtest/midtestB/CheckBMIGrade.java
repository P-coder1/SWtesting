package swtest.midtestB;

public class CheckBMIGrade {
	private BMIGrade grade = BMIGrade.N;
	
	public CheckBMIGrade() {grade =BMIGrade.N;}
	public void check_bmi_grade(int age,double bmi)
		throws InvalidInputException{
		if (age < 16) throw new InvalidInputException();
		BMIGrade tgrade = BMIGrade.N;
		if(age >=16 && age <=29) {
			if(bmi<18) tgrade = BMIGrade.L;
			else if(bmi>=18 && bmi<24) tgrade = BMIGrade.N;
			else if(bmi>=24 && bmi<=25) tgrade = BMIGrade.H;
			else if(bmi>25 && bmi<30) tgrade = BMIGrade.O;
			else if(bmi>=30) tgrade = BMIGrade.S;
		}
		else if (age >29) {
			if(bmi<18) tgrade = BMIGrade.L;
			else if(bmi>=18 && bmi<25) tgrade = BMIGrade.N;
			else if(bmi>=25 && bmi<30) tgrade = BMIGrade.H;
			else if(bmi>=30 && bmi<40) tgrade = BMIGrade.O;
			else if(bmi>=40) tgrade = BMIGrade.S;
		}
		this.grade = tgrade;
	}
	public BMIGrade getGrade() throws InvalidInputException{
		return grade;
	}
	
	


}
