public class StaticError {
	
	int a = 0;
	// main方法是静态的,我们不能使用非静态的变量a
	public static void main(String[] args) {
		System.out.println(a);
	}
}