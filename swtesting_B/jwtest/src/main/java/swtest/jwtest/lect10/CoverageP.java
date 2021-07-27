package swtest.jwtest.lect10;

public class CoverageP {
	public int coverage(int x , int y ,int z) {
		
		if(x>0)
			z=z-1;
		if(y>0)
			z = z + 1;
		return z;
	}
}
