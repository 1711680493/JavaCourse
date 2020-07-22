import java.util.Arrays;

public class Sort {
	
	/**
	 * 冒泡排序.
	 * 工具类都带 static,为了简便.
	 * 返回值是 int 数组,返回我们排序后的数组.
	 * 就算不接收,进行操作了的数组已经是排序的数组.
	 * 接收一个数组,将它进行排序.
	 * 接收一个boolean类型的变量用于判断是从小到大还是从大到小排序,true 为从小到大,false 为从大到小.
	 */
	public static int[] bubbleSort(int[] arr,boolean zf) {
		// 我们循环不需要循环最后一个,因为最后一个后面没有元素了 无法进行比较,也节省性能.
		int size = arr.length - 1;
		
		for (int i = 0;i < size;i++) {
			// 还有一层循环,用于执行实际操作
			// 这里 j < jSize 是因为我们每一次操作完后,i都会+1,比如第一次循环,我们获取到最大值,第二次,第二大,第三次,第三大...
			// 所以没必要进行后面无意义的重复操作.
			int jSize = size - i;
			for (int j = 0;j < jSize;j++) {
				// 我们这里判断 zf, true 则为从小到大,false 从大到小
				if (zf) {
					if (arr[j] > arr[j + 1]) {
						//交换两个元素,如何交换? 使用第三个容器就可以了
						int temp = arr[j];
						arr[j] = arr[j + 1];
						arr[j + 1] = temp;
					}
				} else {
					if (arr[j] < arr[j + 1]) {
						int temp = arr[j];
						arr[j] = arr[j + 1];
						arr[j + 1] = temp;
					}
				}
			}
		}
		// 返回当前数组
		return arr;
	}
	
	/**
	 * 插入排序
	 */
	public static int[] insertSort(int[] arr) {
		// 从 1 开始,由小到大,与前面的作比较
		for (int i = 1;i <arr.length;i++) {
			// 先将当前的值抽出来,并记录当前的上一个数下标
			int iValue = arr[i];
			int j = i - 1;
			// 循环 与前面一个进行对比,比到自己的前面比自己大的那个就放进去.
			// j不能小于0 因为 数组下标最小为0
			while (!(j < 0) && iValue < arr[j]) {
				// 将 j 位置的元素 换到 j+1位置(往后移)
				arr[j+1] = arr[j];
				j--;
			}
			// 执行完操作后就如动态图中展示的那样,j = i - 1,所以现在我们需要 j + 1 进行赋值
			arr[j + 1] = iValue;
		}
		return arr;
	}
	
	/**
	 * 睡眠排序,仅供娱乐.
	 */
	public static void sleepSort(int[] arr) {
		for (int i = 0;i < arr.length;i++) {
			// 我们让所有人有独立的操作(线程)
			// 也就是所有人都是独立的,让每个人睡眠,醒来输出就ok了
			int num = arr[i];
			new Thread(() -> {
				// 睡眠当前数量的时间,醒来输出
				try {
					Thread.sleep(num);
				} catch (Exception e) {}
				System.out.println(num);
			}).start();
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {4,2,3,5,1};
		sleepSort(arr);
	}
	
}