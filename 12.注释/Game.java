import java.util.Scanner;
import java.util.Random;

public class Game {
	public static void main(String[] args) {
		//������Һ��˻�������
		//����һ�ζ���������,ʹ�ö��Ÿ���
		//��һ��Ϊ��ҽ��,�ڶ���Ϊ�˻���� Ĭ����100���
		int money = 100,robotMoney = 100;
		//���Ѫ�����˻�Ѫ��,Ĭ��Ѫ��Ҳ�� 100
		int health = 100,robotHealth = 100;
		//���� Scanner ��Ҫ��ѭ���ﴴ��,����ֻ��Ҫ�õ�һ��Scanner����
		Scanner sc= new Scanner(System.in);
		//��������� Random(�����˵���)
		Random r = new Random();
		//�������
		while (true) {
			//��ʾ�û�
			System.out.println("-------�˻���ս--------");
			System.out.println("*****�����Ϣ*****");
			System.out.println("Ѫ��: " + health);
			System.out.println("���: " + money);
			System.out.println("*****�˻���Ϣ*****");
			System.out.println("Ѫ��: " + robotHealth);
			System.out.println("���: " + robotMoney);
			System.out.println("******************");
			System.out.println("��������:");
			System.out.println("1.������");
			System.out.println("0.�˳�");
			System.out.println("-----------------------");
			//��ȡ���Ҫִ�еĲ��� ������/�˳�
			int operation = sc.nextInt();
			if (operation == 1) {
				//������,����Ͳ�ִ�в���,��ȻҪ������Ĵ��븴�Ƶ�����
				//���Եú��� ����ִ��������ͻ��Զ�����ִ��
				//�˳��������붼����ִ������Ĵ���
			} else if (operation == 0) {
				System.out.println("�´��ټ�~");
				break;
			} else {
				System.out.println("���������ɶ?���������!");
				continue;
			}
			//���������
			int num = r.nextInt(6);
			//��ҵĲ���
			switch (num) {
			case 0:
				//����80��� �����+=��ʵ���� money = money + 80
				money += 80;
				break;
			case 1:
				//�����Է�30���,���ٶԷ�10����ֵ
				money -= 30;
				robotMoney += 30;
				//-=��+=һ�� ������� robotHealth = robotHealth - 10
				robotHealth -= 10;
				break;
			case 2:
				//��Ϣ
				break;
			case 3:
				//�������н�ҶԶԷ�����˺�(������������Ѫ��)
				robotHealth += money / 10;
				money = 0;
				break;
			case 4:
				//������50��� �ָ�20����ֵ
				money += 50; robotMoney += 50;
				health += 20; robotHealth += 20;
				break;
			case 5:
				//������50���,����10����ֵ
				money -= 50; robotMoney -= 50;
				health -= 10; robotHealth -= 10;
				break;
			}
			//��������жϽ��
			if (health <= 0) {
				//���ʧ��
				System.out.println("���Ȼ�������˴����!");
				break;
			} else if (robotHealth <= 0) {
				//���ʤ��
				System.out.println("��ϲ�� ʤ��!");
				break;				
			}
			//�˻�������
			num = r.nextInt(6);
			//�˻��Ĳ���
			switch (num) {
			case 0:
				//����80��� �����+=��ʵ���� robotMoney = robotMoney + 80
				robotMoney += 80;
				break;
			case 1:
				//�����Է�30���,���ٶԷ�10����ֵ
				robotMoney -= 30;
				money += 30;
				//-=��+=һ�� ������� health = health - 10
				health -= 10;
				break;
			case 2:
				//��Ϣ
				break;
			case 3:
				//�������н�ҶԶԷ�����˺�(������������Ѫ��)
				health += robotMoney / 10;
				money = 0;
				break;
			case 4:
				//������50��� �ָ�20����ֵ
				money += 50; robotMoney += 50;
				health += 20; robotHealth += 20;
				break;
			case 5:
				//������50���,����10����ֵ
				money -= 50; robotMoney -= 50;
				health -= 10; robotHealth -= 10;
				break;
			}
			//��������жϽ��
			if (health <= 0) {
				//���ʧ��
				System.out.println("���Ȼ�������˴����!");
				break;
			} else if (robotHealth <= 0) {
				//���ʤ��
				System.out.println("��ϲ�� ʤ��!");
				break;				
			}
		}

	}
}