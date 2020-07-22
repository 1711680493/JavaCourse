//导入Scanner包
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		//创建Scanner 传递System.in参数来接收用户输入的参数
		Scanner s = new Scanner(System.in);
		//提醒输入 \n的意思是换行的意思(可以不加\n自己看一下输出结果 是没有换行的)
		System.out.print("请输入两个数字,我会将这两个数字进行+ - * /运算\n");
		//接收两个数 一个int类型 一个double
		int addOne = s.nextInt();
		double addTwo = s.nextDouble();
		//输出结果 +代表加法操作 或者连接文字等 - * /都代表对应操作(减法,乘法,除法)
		System.out.print("相加等于:" + (addOne+addTwo));
		System.out.print("addOne减addTwo等于:" + (addOne-addTwo));
		System.out.print("相乘等于:" + (addOne*addTwo));
		System.out.print("相除等于:" + (addOne/addTwo));
	}
}