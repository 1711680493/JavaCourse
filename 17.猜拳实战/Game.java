public class Game {
	
	/**
	 * 关卡
	 */
	int level = 1;
	
	/**
	 * 让指定角色下一关(为什么要指定角色? 当然是分配奖励啦).
	 * @author Shendi <a href='tencent://AddContact/?fromId=45&fromSubId=1&subcmd=all&uin=1711680493'>QQ</a>
	 */
	public void upLevel(Player player) {
		// 增加金币 经验,计算规则为 100 * 关卡 + [0-100)
		int addExp = 100 * level + (int)(Math.random() * 100);
		player.addExp(addExp);
		int addMoney = 100 * level + (int)(Math.random() * 100);
		player.money += addMoney;
		System.out.println("**********恭喜你通关了**********");
		System.out.println("奖励经验: " + addExp);
		System.out.println("奖励金币: " + addMoney);
		System.out.println("****************************");
		level++;
	}
	
	/**
	 * 失败给予一点奖励 金币经验随机增加[0,100).
	 */
	public void lose(Player player) {
		// 增加金币 经验,计算规则为 100 * 关卡 + [0-100)
		int addExp = (int)(Math.random() * 100);
		player.addExp(addExp);
		int addMoney = (int)(Math.random() * 100);
		player.money += addMoney;
		System.out.println("**********通关失败**********");
		System.out.println("增加经验: " + addExp);
		System.out.println("增加金币: " + addMoney);
		System.out.println("*************************");
	}
	
}
