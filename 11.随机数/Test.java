//����Random��
import java.util.Random;

public class Test {
	public static void main(String[] args) {
		//��������������ķ�ʽ
		//Math.random();
		int math = ((int)Math.random() * 100) % 3;
		//Random
		Random random = new Random();
		int r = random.nextInt(3);
		//ʱ��� ����Ҫ��(int) ����Ϊ,
		//System.currentTimeMillis() ��ȡ����long����,long��int��.
		//������Ҫת(ȡ��3��int���Է���)
		int time = (int)(System.currentTimeMillis() % 3);
		//���һ�� ��һ���������������ʲô
		System.out.println("math=" + math +",random=" + r +",time=" + time);
		//��ƽ��(��ƽ�����ķ���Ϊ �����,������������)
		System.out.println("���ս��Ϊ��" + ((int)(math + r + time) / 3));
	}
}