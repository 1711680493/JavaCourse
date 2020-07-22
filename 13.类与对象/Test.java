public class Test {
	public static void main(String[] args) {
		// 第一个人 就叫张三吧
		Person p1 = new Person();
		p1.name = "张三";
		p1.sex = "男";
		p1.age = 22;

		// 第二个 李四,注意,别把对象名搞混了
		Person p2 = new Person();
		p2.name = "李四";
		p2.sex = "女";
		p2.age = 21;
		
		// 早上了 我们需要让张三和李四都执行早上的操作
		System.out.println("早上了！");
		operation(p1,0);
		operation(p2,0);
		// 中午
		System.out.println("中午了！");
		operation(p1,1);
		operation(p2,1);
		// 晚上
		System.out.println("晚上了！");
		operation(p1,2);
		operation(p2,2);
	}
	
	/**
	 * 执行操作,这里的 person 传递的是 Person 类的对象.
	 * time 则为分辨白天还是中午还是晚上.
	 * 我们定义 time=0 则是白天,=1则是中午,=2 则是晚上
	 * 因为要在main里使用,所以需要加上 static(不使用我们当前类的对象)
	 */
	static void operation(Person person,int time) {
		// time 来分辨白天中午晚上
		if (0 == time) {
			// 这里的 person 是传递进来的,比如我传递的是p1,那么person就是p1对象
			// 早上吃饭
			person.eat();
		} else if (1 == time) {
			// 中午吃饭
			person.eat();
		} else if (2 == time) {
			// 晚上 吃饭 睡觉
			person.eat();
			person.sleep();
		}
	}
}

class Person {
	// 姓名
	String name;
	// 性别
	String sex;
	// 年龄
	int age;
	// 吃饭 eat中文意思是吃的意思.
	void eat() {
		// 吃饭被调用我们就输出当前人的名字 吃饭
		System.out.println(name + ": 吃饭了");
	}
	// 睡觉 sleep是睡觉的意思
	void sleep() {
		System.out.println(name + ": 睡觉了");
	}
}