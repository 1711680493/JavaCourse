public class FunName {
	public static void main(String[] args) {
		a("1");
		a(2);
	}
	// 方法的重载
	public static void a(String s) {
		System.out.println("字符串:" + s);
	}
	public static void a(int i) {
		System.out.println("数字:" + i);
	}
}