public class TestArr {
	public static void main(String[] args) {
		// ����һ����СΪ 100 ������
		int[] arr = new int[100];
		// ѭ����ֵ�����,����� length ���Կ��Ի�ȡ������Ĵ�С
		// �������ֱ������С�� 100 ���ǽ������С�ı�ͻ������.
		for (int i = 0;i < arr.length;i++) {
			// ����� i ��0��ʼ,Ȼ����1,2,3...99,�������ǿ���������ֵ
			arr[i] = (int)(Math.random()*100);
		}
		// ������ ��֤һ��
		// Ҳ��Ҫѭ�����
		for (int i = 0;i < arr.length;i++) {
			System.out.println("������±� " + i + " ��ֵΪ��" + arr[i]);
		}
	}
}