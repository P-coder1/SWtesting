package swtest.tdd.lect12;

//2. 1의 테스트를 통과할 최소한의 테스트 작성
public class Calculator {
	private int r;
	
	//4. 테스트요구사항 2
	//	 - 계산기의 초기값을 생성자를 통해 설정 할 수 있다.
	public Calculator() {
		r=0;
	}
	
	public Calculator(int r) {
		this.r = r;
	}
	
	//5. 테스트요구사항 3
	//	 - 계산기는 덧셈 기능을 제공한다.
	public void add(int i) {
		//6. 테스트요구사항 4
		// 	 - 계산기는 계산 결과를 저장하는 기능을 가지고 있다.
		//7. 테스트요구사항 5
		//	 - 계산기는 덧셈 기능은 이전 계산 결고와 덧셈을 수행한다.
		r = this.r + i;
	}
	
	//8. 테스트요구사항 6
	//	 - 계산기는 클리어 기능을 통해 이전 계산 결과를 0으로 만든다.
	public void clear() {
		r=0;
	}
	
	//3. 테스트요구사항 1 만족항 코드
	//	 - 계산기의 초기값은 따로 설정하지 않았을 때에 0으로 설정
	public int getResult() {
		return r;
	}
}
