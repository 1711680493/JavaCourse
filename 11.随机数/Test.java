//导入Random类
import java.util.Random;

public class Test {
	public static void main(String[] args) {
		//三种生成随机数的方式
		//Math.random();
		int math = ((int)Math.random() * 100) % 3;
		//Random
		Random random = new Random();
		int r = random.nextInt(3);
		//时间戳 这里要加(int) 是因为,
		//System.currentTimeMillis() 获取的是long类型,long比int大.
		//所以需要转(取余3后int可以放下)
		int time = (int)(System.currentTimeMillis() % 3);
		//输出一下 看一下三个随机数都是什么
		System.out.println("math=" + math +",random=" + r +",time=" + time);
		//求平均(求平均数的方法为 数相加,除以数的数量)
		System.out.println("最终结果为：" + ((int)(math + r + time) / 3));
	}
}