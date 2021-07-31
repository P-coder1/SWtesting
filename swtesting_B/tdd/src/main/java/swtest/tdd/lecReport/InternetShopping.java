package swtest.tdd.lecReport;

import java.util.HashMap;
import java.util.Iterator;

public class InternetShopping {
	Cooperation cp;
	HashMap<String, Integer> h = new HashMap<String, Integer>();

	public void put(String id) {
		//id값이 HashMap에 존재하는지 존재하면 key의 value값을 1증가
		if(h.containsKey(id)) {
			int n = h.get(id);
			h.put(id, n+1);
		}
		else {
			//존재하지 않는 id이면 value값  1로 설정
			h.put(id, 1);
		}
	}
	
	public int getTotalShoppingNumber(String id) {
		//현재 HashMap에 있는 값에서 id에 해당하는 count return
		return h.get(id);
	}
	
	public void setCooperation(Cooperation cp) {
		// TODO Auto-generated method stub
		this.cp = cp;
	}

	//h에 있는 모든 id에 대한 총 가격을 구하는 메서드
	public int totalCooperation() {
		// h를 읽어서 total 가격을 구함
		int total = 0;
		Iterator irt = h.keySet().iterator();
		while(irt.hasNext()) {
			String id = (String)irt.next();
			int itmNum = h.get(id);
			
			//2 + 1 확인
			if(cp.isTwoPlusOne(id)) {
				int itmNumt = itmNum / 2;
				itmNum = itmNumt + (itmNum%2);
			}
			total = total + itmNum*cp.getCooperation(id);
		}
		return total;
	}

	
}
