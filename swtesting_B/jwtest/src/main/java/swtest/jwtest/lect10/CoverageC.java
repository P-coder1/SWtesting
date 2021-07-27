package swtest.jwtest.lect10;

public class CoverageC {
	public void coveragem(int x , int y ,int z) {
		if((x>0) && (y>0))
			z = x - y;
		if((x>2) || (z==0)) //x 가 2보다 큰지 아니면 z가 같은지
				z = z + 1;
		System.out.println("z :" + z);
	}
}
