
public class PersonMain {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setId(1);
		p1.setName("Sam");

		Person p2 = new Person();
		p2.setId(1);
		p2.setName("Sam");

		System.out.println(p1.equals(p2));
	}
	
	
}
