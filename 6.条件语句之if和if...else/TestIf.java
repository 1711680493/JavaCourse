import java.util.Scanner;
public class TestIf {
	public static void main(String[] args) {
		//用户现有 12 元
		int money = 12;
		//输出商品信息
		System.out.println("请输入编号来购买商品");
		System.out.println("1:[Java从入门到精通] 9.9元");
		System.out.println("2:[肥宅快乐水] 3元");
		System.out.println("3:[Shendi Java教程] 999元");
		//输出一个分割线,为了让我们看的更直观
		System.out.println("----------------------------");
		//创建 Scanner 接收用户输入
		Scanner scanner = new Scanner(System.in);
		//获取用户输入的编号
		int input = scanner.nextInt();
		//判断用户所购买的是哪个商品
		if (1 == input) {
			//Java从入门到精通 9.9
			System.out.println("购买了Java从入门到精通\n你还剩下:");
			System.out.print(money - 9.9);
		}
		if (2 == input) {
			//肥宅快乐水 3
			System.out.println("购买了肥宅快乐水\n你还剩下:");
			System.out.print(money - 3);
		}
		if (3 == input) {
			//Java从入门到精通 9.9
			System.out.print("你的金额不够购买 Shendi Java教程，需要999元，而你只有:\n");
			System.out.print(money);
		}
	}
}