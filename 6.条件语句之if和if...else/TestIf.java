import java.util.Scanner;
public class TestIf {
	public static void main(String[] args) {
		//�û����� 12 Ԫ
		int money = 12;
		//�����Ʒ��Ϣ
		System.out.println("����������������Ʒ");
		System.out.println("1:[Java�����ŵ���ͨ] 9.9Ԫ");
		System.out.println("2:[��լ����ˮ] 3Ԫ");
		System.out.println("3:[Shendi Java�̳�] 999Ԫ");
		//���һ���ָ���,Ϊ�������ǿ��ĸ�ֱ��
		System.out.println("----------------------------");
		//���� Scanner �����û�����
		Scanner scanner = new Scanner(System.in);
		//��ȡ�û�����ı��
		int input = scanner.nextInt();
		//�ж��û�����������ĸ���Ʒ
		if (1 == input) {
			//Java�����ŵ���ͨ 9.9
			System.out.println("������Java�����ŵ���ͨ\n�㻹ʣ��:");
			System.out.print(money - 9.9);
		}
		if (2 == input) {
			//��լ����ˮ 3
			System.out.println("�����˷�լ����ˮ\n�㻹ʣ��:");
			System.out.print(money - 3);
		}
		if (3 == input) {
			//Java�����ŵ���ͨ 9.9
			System.out.print("��Ľ������� Shendi Java�̳̣���Ҫ999Ԫ������ֻ��:\n");
			System.out.print(money);
		}
	}
}