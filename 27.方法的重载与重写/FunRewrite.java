public class FunRewrite {
	public static void main(String[] args) {
		BigFish bFish = new BigFish();
		BigFish sFish = new SmallFish();
		bFish.eat();
		sFish.eat();
	}
}

class BigFish {
	public void eat() {
		System.out.println("�����С��");
	}
}

class SmallFish extends BigFish {
	// ��д�ķ���һ�㶼����������� @Override,�Ƚ�ֱ��,����Ҳ�����ʲô����
	@Override
	public void eat() {
		System.out.println("С���Ϻ��");
	}
}