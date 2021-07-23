package swtest.jtest.lect04;

public class Wage {
	static int h_salary; // 시간당 임금
	static int wage; //급여
	
	//생성자
	public Wage() {
		h_salary = 0;
		wage = 0;
	}
	
	//메서드
	static public int calculatePay(Proficiency p, int hours) {		
		if(0 < hours && hours <=3)
			if(p == Proficiency.E) h_salary = 80000;
			else h_salary = 40000;
		else if (3 < hours && hours <=5) 
			if(p == Proficiency.E) h_salary = 100000;// 3시간 이상 5시간 이하
			else h_salary = 50000;
		else if (5 < hours && hours <=40)
			if(p == Proficiency.E) h_salary = 120000;// 5시간 이상 40시간 이하
			else h_salary = 60000;
		
		wage = hours * h_salary;
		return wage;
	}
}
