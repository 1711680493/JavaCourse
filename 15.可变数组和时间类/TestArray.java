import java.util.Scanner;

public class TestArray {
	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
	
		// ���������Լ�д��������Ķ���
		MyArray my = new MyArray();
		while (true) {
			System.out.println("1��,2ɾ,3��,4��");
			int input = sc.nextInt();
			switch (input) {
			case 1:
				System.out.println("������Ҫ���������");
				my.add(sc.next());
				break;
			case 2:
				System.out.println("������Ҫɾ��������λ��(����)");
				my.del(sc.nextInt());
				break;
			case 3:
				System.out.println("������Ҫ���õ�����λ��(����)");
				int index = sc.nextInt();
				System.out.println("������Ҫ���õ�����");			
				my.set(index,sc.next());
				break;
			case 4:
				// ����ֱ��ѭ����ȡ�������
				for (int i = 0;i < my.getSize();i++) {
					System.out.println(i + "\t" + my.get(i));
				}
				break;
			}
		}
	}
}