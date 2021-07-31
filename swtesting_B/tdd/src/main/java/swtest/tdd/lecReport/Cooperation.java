package swtest.tdd.lecReport;

	//InternetShopping의 협력 클래스
public interface Cooperation {
	//제품 id랑 가격 return
	public int getCooperation(String id);
	//2 + 1 행사제품인지 확인
	public boolean isTwoPlusOne(String id);
}
