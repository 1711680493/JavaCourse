
public class MyArray {

	/**
	 * 数组刚开始的大小为 10.
	 */
	Object[] objs = new Object[10];
	
	/**
	 * 实际项的数量,刚开始的时候没有一个项,所以为0.
	 */
	int num = 0;
	
	/**
	 * 数组超过大小时,增加的大小.
	 */
	int newLength = 5;
	
	/**
	 * 添加进数组的方法
	 */
	public void add(Object obj) {
		// 超过了数组的长度则新建一个数组,并复制
		if (num == objs.length) {
			// 原数组放到另一个变量里保存起来,然后原数组改成新数组,在原长度上增加.
			Object[] temp = objs;
			objs = new Object[temp.length + newLength];
			// 将 temp 拷贝到原数组(已经被替换成新数组)
			// 使用循环 一个个赋值...(也有更高效的方法,但是现在重点不是这个)
			for (int i = 0;i < temp.length;i++) {
				objs[i] = temp[i];
			}
		}
		// 添加新项,位置为现有的最后一个
		objs[num] = obj;
		// 现有项 + 1
		num++;
	}

	/**
	 * 删除指定项的方法, index是这个项在数组内的位置.
	 * 这个地方也可以加个返回值,返回删除的内容.
	 */
	public void del(int index) {
		// 先判断是否有指定项,有则删 无则不操作
		if (index < 0 || index >= num) {
			return;
		}
		// 删除,直接将此项后面的往前移...
		// 这里 - 1 是为了避免在执行下面操作数组越界
		int length = objs.length - 1;
		for (int i = index;i < length;i++) {
			objs[i] = objs[i + 1];	
		}
		// 总数量 - 1
		num--;
	}
	
	/**
	 * 设置指定项的方法, index是把 obj 设置到哪个位置(位置必须存在)
	 */
	public void set(int index,Object obj) {
		// 判断项是否存在与 get 方法是一样的,所以复制过来
		// 不同的是没有返回值,我们直接return,代表后面代码不执行.
		if (index < 0 || index >= num) {
			System.err.println("你设置的东西没有了");
			return;
		}
		// 直接将指定位置值设为传递的值
		objs[index] = obj;
	}

	/**
	 * 获取指定位置的项,返回的是Object类型,因为我们需要让这个类可以存所有类型...
	 * 不好的就是,你不知道这个类的具体类型是什么(使用的时候要强转,类型不对会出错).
	 */
	public Object get(int index) {
		// 获取 index 位置的数,如果不存在,则提醒并返回空.
		// index 小于 0 或者 大于 当前实际的项总数,就代表没有这个项,提醒并返回空
		if (index < 0 || index >= num) {
			// 之前我们使用的都是 System.out... err代表错误输出(颜色是红色的)
			System.err.println("你获取的东西没有了,给你返回空");
			// 返回后就不会执行下面的代码了,并且获取到的值为 null
			return null;
		}
		// 直接返回.
		return objs[index];
	}
	
	/**
	 * 获取当前有效大小.
	 */
	public int getSize() {
		return num;
	}
}
