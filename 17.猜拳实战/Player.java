
public class Player {
	/**
	 * 生命值 默认100
	 */
	int health = 100;
	
	/**
	 * 生命上限,扣血不会扣这个,用于事后恢复
	 */
	int defaultHealth = health;
	
	/**
	 * 攻击力 默认10
	 */
	int attack = 10;
	
	/**
	 * 防御力
	 */
	int defence = 0;
	
	/**
	 * 级别 默认为1
	 */
	int level = 1;
	
	/**
	 * 经验值
	 */
	int exp = 0;
	
	/**
	 * 金币
	 */
	int money = 100;
	
	/**
	 * 背包
	 */
	MyArray bag = new MyArray();
	
	/**
	 * 宠物
	 */
	Player pet;
	
	/**
	 * 装备
	 */
	Player equip;
	
	/**
	 * 增加经验
	 */
	public void addExp(int addExp) {
		// 获取当前升级所需要的经验,并判断添加后是否升级
		int upLevel = level * level;
		// 升级所需经验 - 当前经验 小于等于添加的经验则升级
		while (upLevel - exp <= addExp) {
			// 等级+1,经验等于添加经验减去升级剩余所需经验
			level++;
			addExp -= upLevel - exp;
			exp = 0;
			// 升级随机添加血量 攻击力[0-等级*等级],这里用到的不会怎么多 直接使用Math.random.
			defaultHealth += (int)(Math.random()*100)%upLevel;
			health += defaultHealth;
			attack += (int)(Math.random()*100)%upLevel;
			upLevel = level * level;
		}
		exp += addExp;
	}
	
	public String toString() {
		// 创建一个String用于存储我们需要的字符串格式
		// 这里 \r\n 是换行,因为在不同操作系统下换行符不同(有用\r的,有用\n的),所以直接使用\r\n
		String str = "@@@@@@@@@@@@@@@@@@@@@\r\n";
		str += "生命值: " + health;
		str += "\r\n攻击力: " + attack;
		str += "\r\n防御力: " + defence;
		str += "\r\n等级: " + level;
		str += "\r\n经验值: " + exp;
		str += "\r\n下一级所需经验: " + (level*level - exp);
		str += "\r\n金币: " + money;
		// 有宠物/装备则显示 不然不显示
		// \t 等于一个tab键,这样看起来会有级别的感觉
		if (pet != null) {
			str += "\r\n宠物: \r\n\t血量" + pet.health;
			str += "\r\n\t攻击力" + pet.attack;
		}
		// 只有一个语句可以省略 {} 太长就别省略了 不好看.
		if (equip != null) str += "\r\n装备: \r\n\t防御力" + equip.defence;
		str += "\r\n@@@@@@@@@@@@@@@@@@@@@";
		return str;
	}
	
}
