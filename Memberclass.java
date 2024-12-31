public class Memberclass {

	private String message = "Hello from Member Inner Class";

	//Member inner class

	class InnerClass {

		void display() {

			System.out.println(message);

		}

	}
 
	public static void main(String[] args) {

		Memberclass outer = new Memberclass();

		Memberclass.InnerClass inner = outer.new InnerClass();

		inner.display();

	}
 
}
 