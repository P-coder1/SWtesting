package swtest.tdd.lect13;


public class ExIndirectOut {
	private Doc b;
	public void doIt(String str) {
		if(str=="Hello") {
			//Hello World를 출력
			System.out.printf("Hello World");
			b.say("Hello World");
		}
		else {
			//Goodbye 출력
			System.out.printf("Goodbye");
			b.say("Goodbye");
		}
	}
}
