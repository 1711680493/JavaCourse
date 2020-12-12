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
		System.out.println("大鱼吃小鱼");
	}
}

class SmallFish extends BigFish {
	// 重写的方法一般都加上这个玩意 @Override,比较直观,不加也不会出什么问题
	@Override
	public void eat() {
		System.out.println("小鱼吃虾米");
	}
}