import java.util.Scanner;

public class TestString {
	public static void main(String[] args) {
		//输入数字的话都通过 不然不通过
		String str = "1234567890";
		//创建Scanner 顶部导包
		Scanner s = new Scanner(System.in);
		String input = s.next();
		//判断是否包含,使用contains
		if (str.contains(input)) {
			System.out.println("通过!");
		} else {
			System.out.println("不通过!");
		}
	}
}