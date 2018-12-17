
public class Clone1 implements Cloneable {

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	int x;
	transient int y;
	
	public static void main(String[] args)  {
		Clone1 c = new Clone1();
		c.x = 100;
		c.y = 200;
		Object d;
		try {
			d = c.clone();
			System.out.println("c : "+c);
			System.out.println("d : "+d);
		} catch (CloneNotSupportedException e) {
			System.out.println("now that's a surprise!!");
			System.out.println(e);
		}
		
	}
	public String toString(){
		return "clone["+x+", "+y+"]";
	}
}
