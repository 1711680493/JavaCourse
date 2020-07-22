import java.util.Scanner;

public class TestStringIndexOf {
	public static void main(String[] args) {
		//字符串内容
		String str = "测试出现位置";
		//输出 字符 试 在字符串中第一次出现的位置
		System.out.println("试在字符串中出现的位置为：" + str.indexOf('试'));
		//创建Scanner 顶部导包
		Scanner s = new Scanner(System.in);
		String input = s.next();
		//获取指定字符串出现的位置
		System.out.println(str.indexOf(input));
	}
}