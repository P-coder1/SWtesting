package swtest.tdd.lect13;

public interface PriceManager {
	//제품 id랑 가격 return
	public int getPrice(String id);
	//1 + 1 행사제품인지 확인
	public boolean isOnePlusOneApplicable(String id);
}
