public class Fish {
	public void eat() {
		System.out.println("��������ɶ��");
	}
	
	public static void main(String[] args) {
		FishA a = new FishA();
		FishB b = new FishB();
		fishEat(a);
		fishEat(b);
	}
	
	// �����Ǿ�̬�ķ���ʹ��
	// �����Ǹ���,�������ǿ���ʵ�ֶ�̬
	public static void fishEat(Fish f) {
		// ������ݵ��������������õľ�������ķ���
		f.eat();
	}
}

class FishA extends Fish {
	public void eat() {
		System.out.println("A�����");
	}
}

class FishB extends Fish {
	public void eat() {
		System.out.println("B��Բ�");
	}
}