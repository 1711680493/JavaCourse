//����Scanner��
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		//����Scanner ����System.in�����������û�����Ĳ���
		Scanner s = new Scanner(System.in);
		//�������� \n����˼�ǻ��е���˼(���Բ���\n�Լ���һ�������� ��û�л��е�)
		System.out.print("��������������,�һὫ���������ֽ���+ - * /����\n");
		//���������� һ��int���� һ��double
		int addOne = s.nextInt();
		double addTwo = s.nextDouble();
		//������ +����ӷ����� �����������ֵ� - * /�������Ӧ����(����,�˷�,����)
		System.out.print("��ӵ���:" + (addOne+addTwo));
		System.out.print("addOne��addTwo����:" + (addOne-addTwo));
		System.out.print("��˵���:" + (addOne*addTwo));
		System.out.print("�������:" + (addOne/addTwo));
	}
}