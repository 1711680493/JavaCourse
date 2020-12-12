public class TestConstractor {
	// 如果改成 private 就无法创建这个类的对象了,可以参考设计模式之单例模式
	public TestConstractor() {
		System.out.println("无参构造执行");
	}

	public TestConstractor(String str) {
		System.out.println("字符串构造执行: " + str);
	}

	public static void main(String[] args) {
		new TestConstractor();
		new TestConstractor("hello");
	}
}