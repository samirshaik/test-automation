class Greet {
	public String greet(String name) {
		return "Hello " + name;
	}
}

public class HelloWorld {
	public static void main(String[] args) {
		//System.out.println("Hello World!");
		Greet obj = new Greet();
		String greeting = obj.greet("Samir");
		System.out.println(greeting);
	}
}