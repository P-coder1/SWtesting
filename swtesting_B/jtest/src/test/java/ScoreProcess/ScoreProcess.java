package ScoreProcess;

public class ScoreProcess {
	private int jung, gi, repo;
	private char result;
	
	public void hapWithPositiveArgs(int a, int b, int c, int value3) throws IllegalArgumentException{
		if (a < 0 || b < 0 || c < 0 || a > 35 || b > 35 || c > 30 ){
			 throw new IllegalArgumentException();
		}
	}
	
	
	public char hap(int a, int b, int c) {
		int hap = a + b + c;
		
		if(hap >= 80) {
			result = 'A';
		}
		
		else if(hap >= 70) {
			result = 'B';
		}
		
		else if(hap >= 60) {
			result = 'C';
		}
		
		else
			result = 'F';
		
		return result;
	}


	public char getResult() {
		return result;
	}


	public void setResult(char result) {
		this.result = result;
	}



	
	

}
