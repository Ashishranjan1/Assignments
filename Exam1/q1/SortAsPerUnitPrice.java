
import java.util.Comparator;

public class SortAsPerUnitPrice implements Comparator<Merchandise>{
	@Override
	public int compare(Merchandise m1, Merchandise m2) {
		return Double.compare(m2.getUnitPrice(),m1.getUnitPrice());
	}

}