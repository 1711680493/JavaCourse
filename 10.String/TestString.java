public class TestString {
	public static void main(String[] args) {
		//不是对象的字符串 可以使用 == 来判断是否相等
		String str1 = "我们相等";
		String str2 = "我们相等";
		//true为相等 false为不相等,之前学运算符讲过
		System.out.println(str1 == str2);
		//一个不是对象的字符串和一个是对象的字符串 内容一样
		String str3 = new String("我们相等");
		System.out.println(str1 == str3);
		//两个都是对象的字符串
		String str4 = new String("我们相等");
		System.out.println(str3 == str4);
		//使用equals 一个通过new 一个不通过new
		System.out.println(str1.equals(str3));
		//内容不相等就更加不可能相等了
	}
}