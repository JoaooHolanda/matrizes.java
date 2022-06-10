import java.util.Comparator;

class SortSites implements Comparator<Double>{
	@Override
	public int compare(Double a, Double b) {
		if(a > b) return 1;
		if(a < b) return -1;
		
		return 0;
	}
	
}
