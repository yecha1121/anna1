import java.util.Collection;
import java.util.Iterator;

public class Main {
	
	Collection allShapes;
	
	public double totalAreas() {
		Iterator it = allShapes.iterator();
		double total  = 0.0;
		while(it.hasNext()) {
			Shape s = (Shape) it.next();
			total += s.computerArea();
		}
		return total;
	}
	public static void main(String[] args) {

		
		
	}
}
