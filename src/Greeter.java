
public class Greeter {

	private String name;
	private int age;

	public Greeter() {
		name = "Connor";
		age = 17;
	}

	public Greeter(String xName, int xAge) {
		if (xName.length() > 0)
			name = xName;
		if (xAge > 0 && xAge < 130)
			age = xAge;
	}

	public String toString() {
		return "Greeter= name: " + name + ", age: " + age;
	}

}
