/**
 * 用于输出操作的工具类
 */
public class OutUtils {
	
	/**
	 * 输出刚开始的列表提示.
	 */
	public void outStartList() {
		System.out.println("--------------------------");
		System.out.println("猜拳小游戏,请选择:");
		System.out.println("0.退出");
		System.out.println("1.普通猜拳");
		System.out.println("2.货币猜拳");
		System.out.println("3.挑战关卡");
		System.out.println("4.商城");
		System.out.println("5.抽奖(一次200金币)");
		System.out.println("6.一猜到底");
		System.out.println("7.当前属性");
		System.out.println("8.背包");
		System.out.println("--------------------------");
	}
	
	/**
	 * 输出用户当前金币数
	 */
	public void outPlayerMoney(Player player) {
		System.out.println("*********************");
		System.out.println("您当前金币剩余: " + player.money);
		System.out.println("*********************");
	}
	
	/**
	 * 关卡模式提示
	 */
	public void outLevelMode(Player player,int enemyHealth,int enemyAttack,int enemyDefence) {
		System.out.println("*********************");
		System.out.print("你的血量: " + player.health);
		System.out.print("\t对方血量: " + enemyHealth);
		System.out.print("\n你的攻击: " + player.attack);
		System.out.print("\t对方攻击: " + enemyAttack);
		System.out.print("\n你的防御: " + player.defence);
		System.out.println("\t对方防御: " + enemyDefence);
		System.out.println("*********************");
		System.out.println("请出拳 0石头,1剪刀,2布: ");
	}
	
	/**
	 * 商店提示
	 */
	public void outShop(Player player) {
		System.out.println("*********************");
		System.out.println("你的金币: " + player.money);
		System.out.println("---------------------");
		System.out.println("0.返回");
		System.out.println("1.小经验药 200金币 加 50经验");
		System.out.println("2.中经验药 500金币 加150经验");
		System.out.println("3.大经验药 5000金币 加 2000 经验");
		if (player.pet == null) {
			System.out.println("4.宠物购买 200金币.100血量,50攻击力");
		} else {
			System.out.println("4.宠物购买"+ player.pet.level +") "+(200*player.pet.level+1) 
					+"金币.血量: "+ (100 * player.pet.level)
					+",攻击力: "+ (50 * player.pet.level));
		}
		if (player.equip == null) {
			System.out.println("5.装备购买 200金币.10防御力");
		} else {
			System.out.println("5.装备购买("+ player.equip.level +") "+ (200*player.equip.level+1) +"金币.防御力: "+ (10 * player.equip.level));
		}
		System.out.println("*********************");
		System.out.println("请输入:");
	}
	
	/**
	 * 输出当前背包内物品
	 */
	public void outBag(Player player) {
		// 这是引用对象,我们这么做没有创建新的东西,就是做了个指针指向bag.
		MyArray arr = player.bag;
		int size = arr.getSize();
		System.out.println("$$$$$$$$$背包$$$$$$$$$");
		for (int i = 0;i < size;i++) {
			System.out.println(i + ":" + arr.get(i));
		}
		System.out.println("$$$$$$$$$$$$$$$$$$$$$");
		System.out.println("请输入编号直接使用,输入-1返回");
	}
	
}
