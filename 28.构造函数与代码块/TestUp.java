public class TestUp {
	static {
		System.out.println("��̬�����");
	}
	
	public TestUp() {
		System.out.println("���췽��");
	}
	
	{
		System.out.println("�����");
	}
	public static void main(String[] args) {
		System.out.println("main");
		new TestUp();
	}
}