import java.util.Scanner;

public class TestString {
	public static void main(String[] args) {
		//字符串内容
		String str = "0123456789";
		//创建Scanner 顶部导包
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		//获取字符串的指定字符
		System.out.println(str.charAt(input));
	}
}