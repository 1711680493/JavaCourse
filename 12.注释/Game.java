import java.util.Scanner;
import java.util.Random;

public class Game {
	public static void main(String[] args) {
		//定义玩家和人机的属性
		//可以一次定义多个变量,使用逗号隔开
		//第一个为玩家金币,第二个为人机金币 默认有100金币
		int money = 100,robotMoney = 100;
		//玩家血量和人机血量,默认血量也是 100
		int health = 100,robotHealth = 100;
		//创建 Scanner 不要在循环里创建,我们只需要用到一个Scanner就行
		Scanner sc= new Scanner(System.in);
		//创建随机器 Random(别忘了导入)
		Random r = new Random();
		//程序核心
		while (true) {
			//提示用户
			System.out.println("-------人机大战--------");
			System.out.println("*****玩家信息*****");
			System.out.println("血量: " + health);
			System.out.println("金币: " + money);
			System.out.println("*****人机信息*****");
			System.out.println("血量: " + robotHealth);
			System.out.println("金币: " + robotMoney);
			System.out.println("******************");
			System.out.println("请输入编号:");
			System.out.println("1.掷骰子");
			System.out.println("0.退出");
			System.out.println("-----------------------");
			//获取玩家要执行的操作 掷骰子/退出
			int operation = sc.nextInt();
			if (operation == 1) {
				//掷骰子,这里就不执行操作,不然要把下面的代码复制到这里
				//会显得很乱 所以执行完这个就会自动往下执行
				//退出和乱输入都不会执行下面的代码
			} else if (operation == 0) {
				System.out.println("下次再见~");
				break;
			} else {
				System.out.println("你输入的是啥?重新输入吧!");
				continue;
			}
			//玩家掷骰子
			int num = r.nextInt(6);
			//玩家的操作
			switch (num) {
			case 0:
				//增加80金币 这里的+=其实就是 money = money + 80
				money += 80;
				break;
			case 1:
				//交给对方30金币,减少对方10生命值
				money -= 30;
				robotMoney += 30;
				//-=和+=一致 这里等于 robotHealth = robotHealth - 10
				robotHealth -= 10;
				break;
			case 2:
				//休息
				break;
			case 3:
				//花费所有金币对对方造成伤害(负数则是增加血量)
				robotHealth += money / 10;
				money = 0;
				break;
			case 4:
				//都增加50金币 恢复20生命值
				money += 50; robotMoney += 50;
				health += 20; robotHealth += 20;
				break;
			case 5:
				//都减少50金币,减少10生命值
				money -= 50; robotMoney -= 50;
				health -= 10; robotHealth -= 10;
				break;
			}
			//操作完成判断结果
			if (health <= 0) {
				//玩家失败
				System.out.println("你居然被机器人打败了!");
				break;
			} else if (robotHealth <= 0) {
				//玩家胜利
				System.out.println("恭喜你 胜利!");
				break;				
			}
			//人机掷骰子
			num = r.nextInt(6);
			//人机的操作
			switch (num) {
			case 0:
				//增加80金币 这里的+=其实就是 robotMoney = robotMoney + 80
				robotMoney += 80;
				break;
			case 1:
				//交给对方30金币,减少对方10生命值
				robotMoney -= 30;
				money += 30;
				//-=和+=一致 这里等于 health = health - 10
				health -= 10;
				break;
			case 2:
				//休息
				break;
			case 3:
				//花费所有金币对对方造成伤害(负数则是增加血量)
				health += robotMoney / 10;
				money = 0;
				break;
			case 4:
				//都增加50金币 恢复20生命值
				money += 50; robotMoney += 50;
				health += 20; robotHealth += 20;
				break;
			case 5:
				//都减少50金币,减少10生命值
				money -= 50; robotMoney -= 50;
				health -= 10; robotHealth -= 10;
				break;
			}
			//操作完成判断结果
			if (health <= 0) {
				//玩家失败
				System.out.println("你居然被机器人打败了!");
				break;
			} else if (robotHealth <= 0) {
				//玩家胜利
				System.out.println("恭喜你 胜利!");
				break;				
			}
		}

	}
}