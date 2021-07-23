package swtest.jtest.lect05;

public class InvalidInputException extends Exception{
	InvalidInputException(){
		super("잘못된 입력입니다.");
		System.out.println("잘못된 입력입니다.");
	}
}
