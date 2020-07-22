import java.util.Random;
import java.util.Scanner;

public class FingerGuessing {
	public static void main(String[] args) {
		// 文本输出工具类
		OutUtils out = new OutUtils();
		// 方法处理类
		Function fun = new Function();
		// 角色
		Player player = new Player();
		// 游戏类
		Game game = new Game();
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		Game:while (true) {
			out.outStartList();
			// 接收用户的输入,并执行对应操作
			int input = sc.nextInt();
			switch (input) {
			// 输入 0 代表退出游戏,给外层循环命名为 Game,这里使用 break Game就跳出外层循环了
			// 因为代码量少,所以放在一行,美观简洁省空间.
			case 0: break Game;
			// 普通猜拳
			case 1:
				System.out.println("请出拳: 0石头,1剪刀,2布");
				input = sc.nextInt();
				fun.normalFingerGuessing(input);
				break;
			// 货币猜拳
			case 2:
				out.outPlayerMoney(player);
				System.out.println("请输入你要猜的金额:");
				int moneyInput = sc.nextInt();
				System.out.println("请出拳: 0石头,1剪刀,2布");
				input = sc.nextInt();
				fun.moneyFingerGuessing(player,moneyInput,input);
				break;
			// 挑战关卡
			case 3:
				System.out.println("-----你当前挑战的关卡是 " + game.level);
				// 将对方的属性创造出来,就三个,血量攻击力防御力
				// 血量=关卡*关卡,攻击力=随机数,攻击力=随机数(0,关卡*关卡],防御力=随机数[0,关卡*关卡]
				int enemyHealth = game.level * game.level;
				int enemyAttack = random.nextInt(enemyHealth)+1;
				int enemyDefence = random.nextInt(enemyHealth);
				while (true) {
					// 提示,代码量大且固定,放入OutUtils中
					out.outLevelMode(player,enemyHealth,enemyAttack,enemyDefence);
					// 获取用户输入的拳
					input = sc.nextInt();
					// 获取当前攻击拳 和对手出的拳,这部分操作不能封装到Function类了,因为敌人的三个变量都不是对象(引用类型)
					// 所以传递过去就算进行改变,我们这里的仍然不会改变
					// 在 Function 里提供一个功能 将数字变为拳(里面有数组)
					int enemy = random.nextInt(3);
					int attackFinger = random.nextInt(3);
					System.out.println("攻击拳为: " + fun.getFG(attackFinger));
					// 判断你输入的是否中了,中了则扣对方血,同时判断对方是否中了
					System.out.println("你出拳为: "+ fun.getFG(input));
					if (input == attackFinger) {
						// 扣血量为 自己的攻击力 - 对方防御力,伤害最少为1滴血(负数就加血了,不能这样)
						int delHealth = player.attack - enemyDefence;
						delHealth = delHealth <= 0 ? 1 : delHealth;
						enemyHealth -= delHealth;
						System.out.println("你造成伤害: " + delHealth);
					}
					System.out.println("敌人出拳: "+ fun.getFG(enemy));
					if (enemy == attackFinger) {
						int delHealth = enemyAttack - player.defence;
						delHealth = delHealth <= 0 ? 1 : delHealth;
						player.health -= delHealth;
						System.out.println("你被攻击了,扣血: " + delHealth);
					}
					// 判断结果,有三种可能,第一种你没血了,第二种敌人没血了,第三种都没血了(都没血了肯定是你失败啦)
					if (player.health <= 0) {
						game.lose(player);
						// 别忘记将生命值复原
						player.health = player.defaultHealth;
						break;
					} else if (enemyHealth <= 0) {
						game.upLevel(player);
						player.health = player.defaultHealth;
						break;
					}
				}
				break;
			// 商城
			case 4:
				out.outShop(player);
				input = sc.nextInt();
				switch (input) {
				case 0: break;
				// 小经验药水 购买之前先看看有没有,有则数量+1
				// 判断有没有的方法写进 Function 类里
				case 1:
					// 金币是否足够
					if (player.money < 200) {
						System.out.println("金币不足！");
						break;
					} else {
						player.money -= 200;
					}
					
					int num = fun.exists(player.bag,"小经验药水");
					if (num == -1) {
						player.bag.add("小经验药水|1");
					} else {
						String s = (String)player.bag.get(num);
						// 使用 Integer.parseInt() 可以将字符串转换为数字
						// split是将字符串按照某个字符来拆分,因为|是特殊字符,所以我们需要用\转义,\也是特殊字符,所以我们需要用\将\转义...
						player.bag.set(num,"小经验药水|" + (Integer.parseInt(s.split("\\|")[1])+1));
					}
					break;
					// 中经验药水
					case 2:
						if (player.money < 500) {
							System.out.println("金币不足！");
							break;
						} else {
							player.money -= 500;
						}
						
						num = fun.exists(player.bag,"中经验药水");
						if (num == -1) {
							player.bag.add("中经验药水|1");
						} else {
							String s = (String)player.bag.get(num);
							// 使用 Integer.parseInt() 可以将字符串转换为数字
							player.bag.set(num,"中经验药水|" + (Integer.parseInt(s.split("\\|")[1])+1));
						}
						break;
						// 大经验药水
					case 3:
						if (player.money < 5000) {
							System.out.println("金币不足！");
							break;
						} else {
							player.money -= 5000;
						}
						
						num = fun.exists(player.bag,"大经验药水");
						if (num == -1) {
							player.bag.add("大经验药水|1");
						} else {
							String s = (String)player.bag.get(num);
							// 使用 Integer.parseInt() 可以将字符串转换为数字
							player.bag.set(num,"大经验药水|" + (Integer.parseInt(s.split("\\|")[1])+1));
						}
						break;
					case 4:
						if (player.pet == null) {
							if (player.money < 200) {
								System.out.println("金币不足！");
								break;
							} else {
								player.money -= 200;
								player.pet = new Player();
								player.pet.attack = 50;
								player.health += player.pet.health;
								player.defaultHealth = player.health;
								player.attack += player.pet.attack;
							}
						} else {
							if (player.money < (200*player.pet.level+1)) {
								System.out.println("金币不足！");
								break;
							} else {
								player.money -= (200*player.pet.level+1);
								player.pet.level++;
								player.pet.health = (100 * player.pet.level);
								player.pet.attack = (50 * player.pet.level);
								player.health += player.pet.health - (100 * (player.pet.level -1));
								player.defaultHealth = player.health;
								player.attack += player.pet.attack - (100 * (player.pet.level -1));;
							}
						}
						break;
					case 5:
						if (player.equip == null) {
							if (player.money < 200) {
								System.out.println("金币不足！");
								break;
							} else {
								player.money -= 200;
								player.equip = new Player();
								player.equip.defence = 10;
								player.defence += player.equip.defence;
							}
						} else {
							if (player.money < (200*player.equip.level+1)) {
								System.out.println("金币不足！");
								break;
							} else {
								player.money -= (200*player.equip.level+1);
								player.equip.level++;
								player.equip.defence = (10 * player.equip.level);
								player.defence += player.equip.defence - (10 * (player.equip.level -1));;
							}
						}
						break;
				default: break;
				}
				break;
			// 抽奖
			case 5:
				System.out.println("请出拳 0石头,1剪刀,2布: ");
				input = sc.nextInt();
				fun.playLuck(player,input);
				break;
			// 一猜到底
			case 6:
				// 无限猜,当然是死循环 记录当前胜利次数
				int win = 0;
				while (true) {
					System.out.println("请出拳 0石头,1剪刀,2布: ");
					input = sc.nextInt();
					int r = fun.wxfingerGuessing(input,win);
					// 胜利 继续
					if (r == 0) {
						win++;
					//平局 继续 不加胜利次数
					} else if (r == 1) {
						continue;
					// 失败 计算奖励
					} else {
						int winNum = win<<win;
						int addMoney = winNum + random.nextInt(100);
						int addExp = winNum + random.nextInt(100);
						player.money += addMoney;
						player.addExp(addExp);
						System.out.println("%%%%%%%%%%%%%%%%%%");
						System.out.println("击败对手: " + win);
						System.out.println("增加了金币: " + addMoney);
						System.out.println("增加了经验: " + addExp);
						System.out.println("%%%%%%%%%%%%%%%%%%");
						break;
					}
				}
				break;
			// 当前属性
			case 7:
				System.out.println(player);
				break;
			// 背包
			case 8:
				out.outBag(player);
				input = sc.nextInt();
				// 0则退出,否则直接使用编号对应的物品,要先看有没有这个物品
				if (input != -1 && player.bag.getSize() > input) {
					// 获取到对应物品,然后 switch判断执行
					String what = (String)player.bag.get(input);
					// 我们的数据是 名称|数量,根据|拆分得到一个字符串数组,0下标就是名称,1就是数量
					String[] whats = what.split("\\|");
					String name = whats[0];
					int num = Integer.parseInt(whats[1]);
					switch (name) {
					// 小的加50,中的150,大的2000
					case "小经验药水": player.addExp(50); break;
					case "中经验药水": player.addExp(150); break;
					case "大经验药水": player.addExp(2000); break;
					}
					// 用完后数量 - 1,没有数量则去掉此物品
					if (num <= 1) {
						player.bag.del(input);
					} else {
						num--;
						player.bag.set(input,name+"|"+num);
					}
				}
				break;
			// 默认提示重新操作,代码量少,直接放在同一行
			// (之前讲过,每一个分号代表一个语句的结束,加空格是为了美观)
			default: System.out.println("没有此选项,请重新输入编号!"); break;
			}
		}
	}
}