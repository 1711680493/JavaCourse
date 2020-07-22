public class Person {
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