public class TestString {
	public static void main(String[] args) {
		//���Ƕ�����ַ��� ����ʹ�� == ���ж��Ƿ����
		String str1 = "�������";
		String str2 = "�������";
		//trueΪ��� falseΪ�����,֮ǰѧ���������
		System.out.println(str1 == str2);
		//һ�����Ƕ�����ַ�����һ���Ƕ�����ַ��� ����һ��
		String str3 = new String("�������");
		System.out.println(str1 == str3);
		//�������Ƕ�����ַ���
		String str4 = new String("�������");
		System.out.println(str3 == str4);
		//ʹ��equals һ��ͨ��new һ����ͨ��new
		System.out.println(str1.equals(str3));
		//���ݲ���Ⱦ͸��Ӳ����������
	}
}