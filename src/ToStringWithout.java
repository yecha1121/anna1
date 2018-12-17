
public class ToStringWithout {
	int x, y;
	
	public ToStringWithout( int anX, int anY) {

		x=anX; y = anY;
	}
	public static void main(String[] args) {
		System.out.println(new ToStringWithout(42,86));
	}
	public String toString() {
		return "ToStringWith(" + x +", "+y+")";
	}
}
