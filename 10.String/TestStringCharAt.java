import java.util.Scanner;

public class TestString {
	public static void main(String[] args) {
		//�ַ�������
		String str = "0123456789";
		//����Scanner ��������
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		//��ȡ�ַ�����ָ���ַ�
		System.out.println(str.charAt(input));
	}
}