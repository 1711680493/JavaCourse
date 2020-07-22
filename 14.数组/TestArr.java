public class TestArr {
	public static void main(String[] args) {
		// 创建一个大小为 100 的数组
		int[] arr = new int[100];
		// 循环赋值随机数,数组的 length 属性可以获取到数组的大小
		// 如果我们直接设置小于 100 我们将数组大小改变就会出问题.
		for (int i = 0;i < arr.length;i++) {
			// 这里的 i 从0开始,然后变成1,2,3...99,所以我们可以这样赋值
			arr[i] = (int)(Math.random()*100);
		}
		// 最后输出 验证一下
		// 也需要循环输出
		for (int i = 0;i < arr.length;i++) {
			System.out.println("数组的下标 " + i + " 的值为：" + arr[i]);
		}
	}
}