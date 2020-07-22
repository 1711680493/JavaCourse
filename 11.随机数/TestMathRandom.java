public class TestMathRandom {
	//public static void main(String[] args) {
	//	//Math.random() 可以返回一个 0-1 之间的随机小数
	//	double num = Math.random();
	//	System.out.println(num);
	//}

	public static void main(String[] args) {
		double num = Math.random();
		//这里的(int) 代表强制转换(后面学到)
		//现在简单理解,我们生成的数是小数
		//加了(int)后(num * 100)的小数位全部去掉(变为了整数)
		int n = ((int)(num * 100) % 3);
		//n 的最终结果只会为 0或者1或者2,因为模了3(取余数)
		if (n == 0) {
		    System.out.println("n=0");
		} else if (n == 1) {
		    System.out.println("n=1");
		} else if (n == 2) {
		    System.out.println("n=2");
		} else {
		    System.out.println("开挂了吧");
		}
	}
}