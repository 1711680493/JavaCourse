import java.util.Random;

public class Function {
	
	/**
	 * 创建 Random(别忘了导入).
	 */
	Random random = new Random();

	// 定义一个字符串数组,对应 0石头,1剪刀,2布
	String[] fingerGuessing = {"石头","剪刀","布"};
	
	// 抽奖的所有物品
	String[] luck = {"金币100","金币300","金币1000","经验50","经验100","经验150","经验1000","金币清零"};
	
	/**
	 * 普通猜拳 0石头,1剪刀,2布
	 */
	public void normalFingerGuessing(int what) {
		// 随机数获取人机出拳
		int robot = random.nextInt(3);
		// 优化代码,去除重复
		String result = "结果";
		// 相同则平,石头胜剪刀胜布胜石头
		if (what == robot) {
			result = "平局";
		// 你胜利的所有情况石头 对手剪刀,剪刀 对手布,布 对手石头
		} else if ((what == 0 && robot == 1) || (what == 1 && robot == 2) || (what == 2 && robot == 0)) {
			result = "胜利";
		// 没有平 胜利 只剩下失败了
		} else {
			result = "失败";
		}
		System.out.println("----------"+ result +"-----------");
		System.out.println("你出拳为:" + fingerGuessing[what]);
		System.out.println("对手出拳为:" + fingerGuessing[robot]);
		System.out.println("------------------------");
	}
	
	/**
	 * 货币猜拳
	 */
	public void moneyFingerGuessing(Player player,int money,int what) {
		// 金币不够则不允许操作
		if (player.money < money) {
			System.out.println("您的金币不足！");
			// 之前讲过 return就是不执行后面的代码了直接返回
			return;
		}
		
		// 随机数获取人机出拳
		int robot = random.nextInt(3);
		// 相同则平,石头胜剪刀胜布胜石头
		if (what == robot) {
			System.out.println("----------平局-----------");
			System.out.println("你出拳为:" + fingerGuessing[what]);
			System.out.println("对手出拳为:" + fingerGuessing[robot]);
			System.out.println("------------------------");
		// 你胜利的所有情况石头 对手剪刀,剪刀 对手布,布 对手石头
		} else if ((what == 0 && robot == 1) || (what == 1 && robot == 2) || (what == 2 && robot == 0)) {
			player.money += money;
			System.out.println("----------胜利-----------");
			System.out.println("你出拳为:" + fingerGuessing[what]);
			System.out.println("对手出拳为:" + fingerGuessing[robot]);
			System.out.println("你赢取了: " + money);
			System.out.println("------------------------");
		// 没有平 胜利 只剩下失败了
		} else {
			player.money -= money;
			System.out.println("----------失败-----------");
			System.out.println("你出拳为:" + fingerGuessing[what]);
			System.out.println("对手出拳为:" + fingerGuessing[robot]);
			System.out.println("你失去了: " + money);
			System.out.println("------------------------");
		}
	}
	
	/**
	 * 获取当前拳头,根据数字
	 */
	public String getFG(int input) {
		return fingerGuessing[input];
	}
	
	/**
	 * 判断物品在背包内是否存在
	 * 存在返回此物品对应下标,不存在返回-1
	 */
	public int exists(MyArray arr,String name) {
		for (int i = 0;i < arr.getSize();i++) {
			String s = (String)arr.get(i);
			// contains方法是判断有没有这个子串
			// 例如我是 abcd,ab就是我的子串,bc,bd都是,ad则不是
			// 就是判断有没有这个字符串
			if (s.contains(name)) {
				return i;
			}
		}
		return -1;
	}
	
	/**
	 * 幸运抽奖
	 */
	public void playLuck(Player player,int input) {
		// 先判断有没有足够金币
		if (player.money < 200) {
			System.out.println("抽奖需要200金币,你的金币不够!");
			return;
		}
		
		int one = random.nextInt(8);
		int two = random.nextInt(8);
		int three = random.nextInt(8);
		System.out.println("********幸运物品********");
		System.out.println("石头: " + luck[one]);
		System.out.println("剪刀: " + luck[two]);
		System.out.println("布: " + luck[three]);
		System.out.println("*********************");
		System.out.println("你出的幸运拳为: " + fingerGuessing[input]);
		// 将用户输入改到奖励下标,用于获取指定奖励
		input = input == 0 ? one : input == 1 ? two : three;
		System.out.println("恭喜你获得了: " + luck[input]);
		
		switch (input) {
		// 金币100
		case 0: player.money += 100; break;
		// 金币300
		case 1: player.money += 300; break;
		// 金币1000
		case 2: player.money += 1000; break;
		// 经验50
		case 3: player.addExp(50); break;
		// 经验100
		case 4: player.addExp(100); break;
		// 经验150
		case 5: player.addExp(150); break;
		// 经验1000
		case 6: player.addExp(1000); break;
		// 金币清零
		case 7: player.money = 0; break;
		}
	}
	
	/**
	 * 无限猜拳 0石头,1剪刀,2布.
	 * 返回0代表胜利 1平局 2失败.
	 * num参数是胜利的次数.
	 */
	public int wxfingerGuessing(int what,int num) {
		// 随机数获取人机出拳
		int robot = random.nextInt(3);
		// 优化代码,去除重复
		String result = "结果";
		int r = 2;
		// 相同则平,石头胜剪刀胜布胜石头
		if (what == robot) {
			result = "平局";
			r = 1;
		// 你胜利的所有情况石头 对手剪刀,剪刀 对手布,布 对手石头
		} else if ((what == 0 && robot == 1) || (what == 1 && robot == 2) || (what == 2 && robot == 0)) {
			result = "胜利";
			r = 0;
		// 没有平 胜利 只剩下失败了
		} else {
			result = "失败";
		}
		System.out.println("---------"+ result + num + "----------");
		System.out.println("你出拳为:" + fingerGuessing[what]);
		System.out.println("对手出拳为:" + fingerGuessing[robot]);
		System.out.println("------------------------");
		return r;
	}
	
}
