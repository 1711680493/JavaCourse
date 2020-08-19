public class Test{

	public static void main(String[] args) {
		People a = new People();
		a.name = "A";
		a.superName = "B";
		People b = new People();
		b.name = "B";
		People c = new People();
		c.name = "C";
		People d = new People();
		d.name = "D";

		System.out.println(a.name + ":" + a.superName);
		System.out.println(b.name + ":" + b.superName);
		System.out.println(c.name + ":" + c.superName);
		System.out.println(d.name + ":" + d.superName);
	}
}