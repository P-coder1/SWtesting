package swtest.jtest.lect03;

public class simpleCalculator {
	private int result = 0;
	//인가의 값이 음수이면 Exception 발생
	public void addWithPositiveArgs(int x, int y) 
			throws IllegalArgumentException{
		if(x < 0 || y < 0) throw new IllegalArgumentException(); // 인자값을 확인
			result = x + y; // 아니면 더하기 값을 리턴해줌
	}
	//파라미터 테스트를 위해
	public void weiredAdd(int x ,int y) {
		if(x == 5&& y ==7) result = 100; // 더하면 100 이 나오고 나머지는 나눔
		else result = x + y;
	}
	
	public void add(int x, int y) {
		result = x + y;
	}
	public void sub(int x, int y) {
		result = x - y;
	}
	public void div(int x, int y) {
		result = x / y;
	}
	
	public void inc(int d) {
		result += d;
	}
	
	public void dec(int d) {
		result -= d;
	}
	public int getResult() {
		return result;
	}

}
