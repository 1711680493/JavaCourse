public class TestMathRandom {
	//public static void main(String[] args) {
	//	//Math.random() ���Է���һ�� 0-1 ֮������С��
	//	double num = Math.random();
	//	System.out.println(num);
	//}

	public static void main(String[] args) {
		double num = Math.random();
		//�����(int) ����ǿ��ת��(����ѧ��)
		//���ڼ����,�������ɵ�����С��
		//����(int)��(num * 100)��С��λȫ��ȥ��(��Ϊ������)
		int n = ((int)(num * 100) % 3);
		//n �����ս��ֻ��Ϊ 0����1����2,��Ϊģ��3(ȡ����)
		if (n == 0) {
		    System.out.println("n=0");
		} else if (n == 1) {
		    System.out.println("n=1");
		} else if (n == 2) {
		    System.out.println("n=2");
		} else {
		    System.out.println("�����˰�");
		}
	}
}