public class TestConstractor {
	// ����ĳ� private ���޷����������Ķ�����,���Բο����ģʽ֮����ģʽ
	public TestConstractor() {
		System.out.println("�޲ι���ִ��");
	}

	public TestConstractor(String str) {
		System.out.println("�ַ�������ִ��: " + str);
	}

	public static void main(String[] args) {
		new TestConstractor();
		new TestConstractor("hello");
	}
}