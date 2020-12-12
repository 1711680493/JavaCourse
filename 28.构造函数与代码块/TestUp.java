public class TestUp {
	static {
		System.out.println("静态代码块");
	}
	
	public TestUp() {
		System.out.println("构造方法");
	}
	
	{
		System.out.println("代码块");
	}
	public static void main(String[] args) {
		System.out.println("main");
		new TestUp();
	}
}