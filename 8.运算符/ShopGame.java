import java.util.Scanner;

public class ShopGame {
	public static void main(String[] args) {
		//����ֵ Ĭ��100 ��ֵ
		int health = 100;
		//��� Ĭ��Ϊ 0
		int money = 0;
		//����Scanner
		Scanner input = new Scanner(System.in);
		//�������һ��,���Ի�һ��
		System.out.println("��ʼ��Ϸ");
		//����� W: �Ǹ�ѭ������ ��Ϊ�̵깺����ͨ��ҩˮ��������switch
		//������Ҫʹ��������ָ�������ĸ�
		W:while (true) {
			//��ǰ�ĳ��� ��
			//�����û���ǰ�����Լ�����������
			//0 Ϊ˯��,1 Ϊȥ���
			System.out.println("**********************");
			System.out.println("��ǰ�ĳ���: ��");
			//������������� ����ÿִ��һ�β����͸��������������
			System.out.println("�㵱ǰ�Ľ���ֵ:" + health);
			System.out.println("�㵱ǰ�Ľ��:" + money);
			System.out.println("��������,�����ѡ��:");
			System.out.println("0.˯��");
			System.out.println("1.ȥ�����");
			System.out.println("**********************");
			//�����û���Ŀ��
			int home = input.nextInt();
			//ִ��Ŀ��
			if (home == 0) {
				//˯�� ��20�㽡��ֵ
				health = health + 20;
				//����ֵ���ܳ���100
				//���ں��ڼ��̵� M ���ұߵ��ұ�Ҳ���ǵ�. Ҫͬʱ����shift��
				if (health > 100) {
					health = 100;
				}
				System.out.println("Zzzzz...");
			} else if (home == 1) {
				//ȥ����� �����Ĵ��븴������
				//��Ϊȥ����� �� �ڴ�������β���
				health = health - 10;
				if (health < 0) {
					System.out.println("���ź�,�����սʧ�ܣ�");
					break;
				}
				//�����û���ǰ�ĳ�������
				//0�̵� 1�� 2�Է�
				System.out.println("**********************");
				System.out.println("��ǰ�ĳ���: ���");
				System.out.println("�㵱ǰ�Ľ���ֵ:" + health);
				System.out.println("�㵱ǰ�Ľ��:" + money);
				System.out.println("��������,�����ѡ��:");
				System.out.println("0.ȥ���̵�");
				System.out.println("1.��");
				System.out.println("2.�Է�");
				System.out.println("**********************");
				//�����û���Ŀ�� ���������Ϊstreet ������˼Ϊ�ֵ�
				int street = input.nextInt();
				//����ʹ�� switch,��Ϥһ��
				switch (street) {
				case 0:
					//ȥ���̵� �� ���̵�����������
					health = health - 10;
					if (health < 0) {
						System.out.println("���ź�,�����սʧ�ܣ�");
						break;
					}
					//�����û���ǰ�ĳ�������
					//0����ҩˮ 1ͨ��ҩˮ ���඼Ϊ�ؼ�
					System.out.println("**********************");
					System.out.println("��ǰ�ĳ���: �̵�");
					System.out.println("�㵱ǰ�Ľ���ֵ:" + health);
					System.out.println("�㵱ǰ�Ľ��:" + money);
					System.out.println("��������,�����ѡ��:");
					System.out.println("0.����ҩˮ 200���");
					System.out.println("1.ͨ��ҩˮ 1000���");
					System.out.println("�����Ŷ�Ϊ�ؼ�");
					System.out.println("**********************");
					//�����û���Ŀ�� ���������Ϊshop ������˼Ϊ�̵�
					int shop = input.nextInt();
					if (shop == 0) {
						//����ҩˮ ��Ҳ���ֱ�Ӹϻؼ�
						if (money < 200) {
							System.out.println("��λ�͹�,���������.");
						} else {
							health = 100;
							money = money - 200;
							System.out.println("����ֵ������");
						}
					} else if (shop == 1) {
						//ͨ��ҩˮ,��Ҳ���ֱ�ӻؼ�
						if (money < 1000) {
							System.out.println("��λ�͹�,���������.");
						} else {
							money = money - 1000;
							System.out.println("��ϲ��ȡ�������յ�ʤ����");
							//���������ѭ�� ������switch,W��������
							break W;
						}
					}
					break;
				case 1:
					//�� ����20����ֵ��ȡ100���
					//����ֵ������ô��? ��Ȼ�ǰ������(��ֻ�ܻؼ�)
					if (health > 20) {
						//�� ���Ľ���ֵ��ȡ���
						health = health - 20;
						money = money + 100;
					} else {
						//����ֵ���� ������� ʹ��continue ֱ�Ӵ�ͷ��ʼ(����)
						System.out.println("���������ܻ����?�ؼ�ϴϴ˯��!");
						continue;
					}
					break;
				case 2:
					//�Է� ����50��� �ָ�30����ֵ
					//��Ҳ�����ô��? ��ȥ��������û����Ǯ,��Ȼ�ǰ������.
					if (money > 50) {
						money = money - 50;
						health = health + 30;
					} else {
						//��Ҳ��� ������� ʹ��continue ֱ�Ӵ�ͷ��ʼ(����)
						System.out.println("��԰�����?�ؼ�ϴϴ˯��!");
						continue;
					}
					break;
				//default ������if�� else,Ҳ����������������������ִ�д�
				default:
					System.out.println("�������˴��,����û����Ҫ�Ķ���,��ؼ���.");
				break;
				}
			} else {
				System.out.println("û�д˲���,����������!");
				//��Ϊ���������(��û��ִ�в���) ���Բ���Ҫ������ֵ
				//ʹ��continue(����) ��ֱ�Ӵ�ͷ��ʼִ����
				continue;
			}
			//ִ��һ�β���,����ֵ��ȥ10(���ڴ����������,���жϽ��������)
			//���� - �ڼ�������һ��С����0���ұ�
			health = health - 10;
			//�жϽ�� ����ֵС��0��ʧ���� ��ѭ�������·�
			//С�ں� < �ڼ���M���ұ� Ҳ���Ƕ���,Ҫͬʱ����Shift��
			if (health < 0) {
				//��ʾ��Ϸʧ��
				System.out.println("���ź�,�����սʧ�ܣ�");
				//����ѭ�� ���������ֻ����ִ��ѭ����Ĵ���
				break;
			}
		}
		//����ѭ����ͻ�ִ�е��������� ����û����� ���Գ���ֱ�ӽ���
	}
}