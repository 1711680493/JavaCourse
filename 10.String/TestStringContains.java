import java.util.Scanner;

public class TestString {
	public static void main(String[] args) {
		//�������ֵĻ���ͨ�� ��Ȼ��ͨ��
		String str = "1234567890";
		//����Scanner ��������
		Scanner s = new Scanner(System.in);
		String input = s.next();
		//�ж��Ƿ����,ʹ��contains
		if (str.contains(input)) {
			System.out.println("ͨ��!");
		} else {
			System.out.println("��ͨ��!");
		}
	}
}