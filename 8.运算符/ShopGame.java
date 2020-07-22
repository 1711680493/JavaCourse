import java.util.Scanner;

public class ShopGame {
	public static void main(String[] args) {
		//健康值 默认100 满值
		int health = 100;
		//金币 默认为 0
		int money = 0;
		//创建Scanner
		Scanner input = new Scanner(System.in);
		//输出提醒一下,人性化一点
		System.out.println("开始游戏");
		//这里的 W: 是给循环命名 因为商店购买了通关药水跳出的是switch
		//所以需要使用名称来指定跳出哪个
		W:while (true) {
			//当前的场景 家
			//提醒用户当前场景以及操作的内容
			//0 为睡觉,1 为去大街
			System.out.println("**********************");
			System.out.println("当前的场景: 家");
			//玩家有两个属性 我们每执行一次操作就给输出方便见到结果
			System.out.println("你当前的健康值:" + health);
			System.out.println("你当前的金币:" + money);
			System.out.println("请输入编号,你可以选择:");
			System.out.println("0.睡觉");
			System.out.println("1.去往大街");
			System.out.println("**********************");
			//接收用户的目的
			int home = input.nextInt();
			//执行目的
			if (home == 0) {
				//睡觉 加20点健康值
				health = health + 20;
				//健康值不能超过100
				//大于号在键盘的 M 的右边的右边也就是点. 要同时按下shift键
				if (health > 100) {
					health = 100;
				}
				System.out.println("Zzzzz...");
			} else if (home == 1) {
				//去往大街 将最后的代码复制上来
				//因为去往大街 和 在大街是两次操作
				health = health - 10;
				if (health < 0) {
					System.out.println("很遗憾,你的挑战失败！");
					break;
				}
				//提醒用户当前的场景操作
				//0商店 1打工 2吃饭
				System.out.println("**********************");
				System.out.println("当前的场景: 大街");
				System.out.println("你当前的健康值:" + health);
				System.out.println("你当前的金币:" + money);
				System.out.println("请输入编号,你可以选择:");
				System.out.println("0.去往商店");
				System.out.println("1.打工");
				System.out.println("2.吃饭");
				System.out.println("**********************");
				//接收用户的目的 这里变量名为street 中文意思为街道
				int street = input.nextInt();
				//这里使用 switch,熟悉一下
				switch (street) {
				case 0:
					//去往商店 和 在商店是两个操作
					health = health - 10;
					if (health < 0) {
						System.out.println("很遗憾,你的挑战失败！");
						break;
					}
					//提醒用户当前的场景操作
					//0健康药水 1通关药水 其余都为回家
					System.out.println("**********************");
					System.out.println("当前的场景: 商店");
					System.out.println("你当前的健康值:" + health);
					System.out.println("你当前的金币:" + money);
					System.out.println("请输入编号,你可以选择:");
					System.out.println("0.健康药水 200金币");
					System.out.println("1.通关药水 1000金币");
					System.out.println("其余编号都为回家");
					System.out.println("**********************");
					//接收用户的目的 这里变量名为shop 中文意思为商店
					int shop = input.nextInt();
					if (shop == 0) {
						//健康药水 金币不够直接赶回家
						if (money < 200) {
							System.out.println("这位客官,出口这边请.");
						} else {
							health = 100;
							money = money - 200;
							System.out.println("健康值加满了");
						}
					} else if (shop == 1) {
						//通关药水,金币不够直接回家
						if (money < 1000) {
							System.out.println("这位客官,出口这边请.");
						} else {
							money = money - 1000;
							System.out.println("恭喜你取得了最终的胜利！");
							//跳出最外层循环 而不是switch,W是命名的
							break W;
						}
					}
					break;
				case 1:
					//打工 消耗20健康值换取100金币
					//健康值不够肿么办? 当然是把你赶走(你只能回家)
					if (health > 20) {
						//打工 消耗健康值换取金币
						health = health - 20;
						money = money + 100;
					} else {
						//健康值不够 把你赶走 使用continue 直接从头开始(家里)
						System.out.println("就你这体能还想打工?回家洗洗睡吧!");
						continue;
					}
					break;
				case 2:
					//吃饭 消耗50金币 恢复30健康值
					//金币不够怎么办? 你去吃自助餐没带够钱,当然是把你赶走.
					if (money > 50) {
						money = money - 50;
						health = health + 30;
					} else {
						//金币不够 把你赶走 使用continue 直接从头开始(家里)
						System.out.println("想吃霸王餐?回家洗洗睡吧!");
						continue;
					}
					break;
				//default 类似于if的 else,也就是上面所有条件不成立执行此
				default:
					System.out.println("你来到了大街,但是没有你要的东西,你回家了.");
				break;
				}
			} else {
				System.out.println("没有此操作,请重新输入!");
				//因为是输入错误(并没有执行操作) 所以不需要减健康值
				//使用continue(继续) 就直接从头开始执行了
				continue;
			}
			//执行一次操作,健康值减去10(放在代码的最下面,在判断结果的上面)
			//减号 - 在键盘上面一排小数字0的右边
			health = health - 10;
			//判断结果 健康值小于0则失败了 在循环的最下方
			//小于号 < 在键盘M的右边 也就是逗号,要同时按下Shift键
			if (health < 0) {
				//提示游戏失败
				System.out.println("很遗憾,你的挑战失败！");
				//跳出循环 不跳出则又会继续执行循环里的代码
				break;
			}
		}
		//跳出循环后就会执行到这里来了 这里没有语句 所以程序直接结束
	}
}