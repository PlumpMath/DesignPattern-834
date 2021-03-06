package dp.actional.Strategy2;

import java.util.Comparator;

public class CatHeightComparator implements Comparator<Cat> {

	@Override
	public int compare(Cat o1, Cat o2) {
		Cat c1 = (Cat)o1;
		Cat c2 = (Cat)o2;
		if(c1.getHeight() > c2.getHeight()) return 1;
		else if(c1.getHeight() < c2.getHeight()) return -1;
		return 0;
		
	}

}
