import java.util.Scanner;

public class TestFunction {
	public static void main(String[] args) {
		// 需要接收用户输入 当然要先创建Scanner(别忘记引入了)
		Scanner sc = new Scanner(System.in);
		// 接收四次输入
		System.out.println("请输入四次数字");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		// 获取前两个数 和 后两个数的最大值(我这里直接进行输出调用了(现在不用纠结太多))
		// 因为 max 函数返回的是求取我们传递的两个数中大的那个,所以我们可以直接进行输出.
		// 字符串连接使用 加号(+) 以前讲过.
		System.out.println("前两次最大的数:" + max(num1,num2));
		System.out.println("后两次最大的数:" + max(num3,num4));
		// 在完成前面两个功能后,如何获取四个数中最大的那个呢?
		// 很简单,我们只需要获取前面和后面最大的数,然后在求这两个数中最大的数就可以了!
		// 这里理解很容易,我们的max函数求最大值,接收两个int类型,max函数本身返回int类型.
		System.out.println("四个数中最大的数:" + max(max(num1,num2),max(num3,num4)));
	}

	/**
	 * 我现在使用的是文档注释,文档注释在方法和类的上方使用(现在只做了解,后面会详细介绍).
	 * 下面是我们定义的方法,功能为获取 num1和num2中大的那个.
	 * 这个地方要加 static 是因为我们需要在main方法中使用(不要纠结为什么).
	 */
	static int max(int num1,int num2) {
		// 这里我们要执行判断 num1和num2 谁大
		// 我提供两种思路,第一种使用 if else,第二种使用之前学运算符的三元运算符
		// 第一种,使用if else的,三元运算符比if else性能高(速度快),所以我把if else注释了
		// 这里代码的内容是,如果 num1 大于 num2 我们就返回num1(调用的地方获取的值就为num1)
		// 返回可能有点难理解,不过多动手敲代码试一试就自然懂了.
		/* 多行注释 
		if (num1 > num2) {
			return num1;
		} else {
			retrun num2;
		}*/
		// 使用三元运算符,代码量更少,并且性能更高.
		// 一行代码完成判断,意思与上方的if else一致
		return num1 > num2 ? num1 : num2;
	}
	
}