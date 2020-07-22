import java.util.Scanner;

public class TestArray {
	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
	
		// 创建我们自己写的数组类的对象
		MyArray my = new MyArray();
		while (true) {
			System.out.println("1增,2删,3改,4查");
			int input = sc.nextInt();
			switch (input) {
			case 1:
				System.out.println("请输入要保存的数据");
				my.add(sc.next());
				break;
			case 2:
				System.out.println("请输入要删除的数据位置(数字)");
				my.del(sc.nextInt());
				break;
			case 3:
				System.out.println("请输入要设置的数据位置(数字)");
				int index = sc.nextInt();
				System.out.println("请输入要设置的数据");			
				my.set(index,sc.next());
				break;
			case 4:
				// 这里直接循环获取进行输出
				for (int i = 0;i < my.getSize();i++) {
					System.out.println(i + "\t" + my.get(i));
				}
				break;
			}
		}
	}
}