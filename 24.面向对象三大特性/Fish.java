public class Fish {
	public void eat() {
		System.out.println("父类的鱼吃啥？");
	}
	
	public static void main(String[] args) {
		FishA a = new FishA();
		FishB b = new FishB();
		fishEat(a);
		fishEat(b);
	}
	
	// 这里是静态的方便使用
	// 参数是父类,这样我们可以实现多态
	public static void fishEat(Fish f) {
		// 如果传递的子类对象这里调用的就是子类的方法
		f.eat();
	}
}

class FishA extends Fish {
	public void eat() {
		System.out.println("A鱼吃肉");
	}
}

class FishB extends Fish {
	public void eat() {
		System.out.println("B鱼吃草");
	}
}