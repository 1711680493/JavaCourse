import java.util.Scanner;

public class TestStringIndexOf {
	public static void main(String[] args) {
		//�ַ�������
		String str = "���Գ���λ��";
		//��� �ַ� �� ���ַ����е�һ�γ��ֵ�λ��
		System.out.println("�����ַ����г��ֵ�λ��Ϊ��" + str.indexOf('��'));
		//����Scanner ��������
		Scanner s = new Scanner(System.in);
		String input = s.next();
		//��ȡָ���ַ������ֵ�λ��
		System.out.println(str.indexOf(input));
	}
}